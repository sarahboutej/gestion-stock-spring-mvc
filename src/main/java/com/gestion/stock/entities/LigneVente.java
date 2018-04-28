package com.gestion.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements  Serializable{
	
	@Id
	private Long IdLigneVente;
	
	@ManyToOne
	@JoinColumn(name="IdVente")
	private Vente vente;

	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	public LigneVente() {


	}

	public Long getIdLigneVente() {
		return IdLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		IdLigneVente = idLigneVente;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
	

}
