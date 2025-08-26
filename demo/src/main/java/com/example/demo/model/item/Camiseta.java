package com.example.demo.model.item;

import com.example.demo.model.enumerator.FormatoCamiseta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Camiseta extends Item{
    @Enumerated(EnumType.STRING)
    private FormatoCamiseta formato;
}
