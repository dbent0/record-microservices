package com.recordshop.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long idCliente;
    private String documentoCliente;
    private String nomeCliente;
    private Long idDisco;
    private String nomeDisco;
    private Integer quantidadeDisco;
    private Float valorDisco;
}
