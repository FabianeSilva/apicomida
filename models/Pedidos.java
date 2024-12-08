package br.com.edusync.apicomida.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Pedidos {

    private String nomeComida;
    private BigDecimal valorComida;
}
