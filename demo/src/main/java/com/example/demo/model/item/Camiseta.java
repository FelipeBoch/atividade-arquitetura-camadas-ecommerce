package com.example.demo.model.item;

import com.example.demo.model.enumerator.FormatoCamiseta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Camiseta extends Item{
    @Enumerated(EnumType.STRING)
    private FormatoCamiseta formato;
}
