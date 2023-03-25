package br.com.uniamerica.estacionamento.entity;

import jakarta.persistence.*;
import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "veiculo", schema = "public")
public class Veiculo extends AbstractEntity{
    @Getter @Setter
    @Column(name = "placa", length = 10, nullable = false, unique = true)
    private String placa;
    @Getter @Setter
    @Column(name = "cor", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Cor cor;
    @Getter @Setter
    @Column(name = "modelo", nullable = false)
    private Modelo modelo;
    @Getter @Setter
    @Column(name = "cor", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Getter @Setter
    @Column(name = "ano", nullable = false)
    private LocalDate ano;
}
