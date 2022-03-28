package br.com.yasmim.dolinski.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class HorarioFuncionamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HORARIO_FUNCIONAMENTO")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TX_DIA_SEMANA")
	private String diaSemana;
	
	@Column(name = "HR_ABERTURA")
	private LocalDate abertura;
	
	@Column(name = "HR_FECHAMENTO")
	private LocalDate fechamento;
	
	@JoinColumn(name = "ID_RESTAURANTE")
	private Restaurante restaurante;
}
