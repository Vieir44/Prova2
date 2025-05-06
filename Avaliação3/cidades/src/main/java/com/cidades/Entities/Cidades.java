package com.cidades.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Cidades")
public class Cidades {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "populacao")
	private String populacao;
	
	@Column(name = "prefeito")
	private String prefeito;
	
	@Column(name = "nome")
	private String nome;
	
	
	



}
