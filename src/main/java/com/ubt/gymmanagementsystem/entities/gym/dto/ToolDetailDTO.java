package com.ubt.gymmanagementsystem.entities.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToolDetailDTO {

    private Long id;
    private String name;
    private String value;
    private Long toolId;
}