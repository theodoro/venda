package br.com.dk.venda.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="tblcliente")

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="seq_cli", initialValue=1)
	@GeneratedValue(generator="seq_cli", strategy=GenerationType.AUTO)
	@Column(name="id_cliente")
	private Long id;
	@Column(nullable=false, length=55)
	private String nome;
	@Column(nullable=false, length=55)
	private String email;
	@Column(nullable=false, length=15)
	private String cpf;
	@Column(nullable=false, length=55)
	private String endereco;
	@Column(nullable=false, name="data_nascimento")
	private Date dataNasc;
	@Column(nullable=false)
	private Double renda;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	
	

}
