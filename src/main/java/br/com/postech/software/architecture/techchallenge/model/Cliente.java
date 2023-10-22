package br.com.postech.software.architecture.techchallenge.model;

import lombok.Data;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true, unique = true, length = 14)
	private String cpf;

	@Column(nullable = true, length = 255)
	private String name;

	@Column(nullable = true, length = 255)
	private String email;

	@Column(nullable = true,length = 255)
	private String senha;
}
