package br.com.db1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "lembrete")
public class Lembrete {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data_lembrete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_lembrete() {
		return data_lembrete;
	}

	public void setData_lembrete(Date data_lembrete) {
		this.data_lembrete = data_lembrete;
	}
			
}
