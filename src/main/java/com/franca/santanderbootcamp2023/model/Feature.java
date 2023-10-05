package com.franca.santanderbootcamp2023.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tb_feature")
public class Feature extends BaseItem{

}
