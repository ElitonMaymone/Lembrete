package br.com.db1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lembrete")
public class Lembrete {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 2, nullable = false)
	private String DESCRICAO;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return DESCRICAO;
	}

	public void setDescricao(String descricao) {
		this.DESCRICAO = descricao;
	}

	@Override
	public String toString() {
		return "Lembrete [id=" + id + ", descricao=" + DESCRICAO + "]";
	}

	public void setAnotacao(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
