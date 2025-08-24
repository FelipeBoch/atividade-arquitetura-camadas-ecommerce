package com.example.demo.model.item;

import com.example.demo.model.enumerator.FormatoMoletom;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Moletom extends Item{
    @Enumerated(EnumType.STRING)
    private FormatoMoletom formato;
}
