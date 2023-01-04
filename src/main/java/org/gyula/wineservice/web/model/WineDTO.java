package org.gyula.wineservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WineDTO {
    private UUID uuid;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String wineName;
    private WineStyleEnum wineStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;

}
