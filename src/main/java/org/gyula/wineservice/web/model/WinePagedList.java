package org.gyula.wineservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class WinePagedList extends PageImpl<WineDTO> {
    public WinePagedList(List<WineDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public WinePagedList(List<WineDTO> content) {
        super(content);
    }
}
