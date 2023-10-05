package com.franca.santanderbootcamp2023.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseItem {
    private String icon;
    private String description;
}
