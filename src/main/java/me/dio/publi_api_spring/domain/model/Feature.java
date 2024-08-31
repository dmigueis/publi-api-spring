package me.dio.publi_api_spring.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_features")
public class Feature extends BaseItem {
    //Será herdado o código da BaseItem
}
