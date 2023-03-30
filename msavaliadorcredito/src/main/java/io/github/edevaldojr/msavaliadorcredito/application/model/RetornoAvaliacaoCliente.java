package io.github.edevaldojr.msavaliadorcredito.application.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RetornoAvaliacaoCliente {
    
    private List<CartaoAprovado> cartoes;

}