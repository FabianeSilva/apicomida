package br.com.edusync.apicomida.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class Comida {

    private Integer codigo;
    private String nomeDoCliente;
    private String enderecoEntrega;
    private BigDecimal valorTotal;
    private List<Pedidos> pedidos = new ArrayList<>();
}
