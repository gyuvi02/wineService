package org.gyula.wineservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.gyula.wineservice.web.model.WineDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WineController.class)
class WineControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getWineById() throws Exception {
        mockMvc.perform(get("/api/v1/wine/" + UUID.randomUUID().toString())
                        .accept(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk());
    }

    @Test
    void saveNewWine() throws Exception {
        WineDTO wineDTO = WineDTO.builder().build();
        String wineDTOJson = objectMapper.writeValueAsString(wineDTO);
        mockMvc.perform(post("/api/v1/wine/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(wineDTOJson))
                        .andExpect(status().isCreated());
    }

    @Test
    void updateById() throws Exception {
        WineDTO wineDTO = WineDTO.builder().build();
        String wineDTOJson = objectMapper.writeValueAsString(wineDTO);
        mockMvc.perform(put("/api/v1/wine/" + UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(wineDTOJson))
                        .andExpect(status().isNoContent());

    }
}