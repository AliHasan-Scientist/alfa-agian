package com.alfa.again.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class propertyDTO {
    private String title;
    private String description;
    private String ownerName;
    private String email;
    private Long price;
    private String address;
}
