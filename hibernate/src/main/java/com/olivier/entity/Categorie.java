/*package com.olivier.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Categorie implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idCategorie;
	
	@NotEmpty
	@Size(min=4,max=29)
	private String nomCategorie;
	
	@Lob
	private byte[] nomPhoto;
	
	public Categorie(){
		
	}
	
	public Categorie(Long idCategorie, String nomCategorie, byte[] nomPhoto,
			Collection<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.nomPhoto = nomPhoto;
		this.produits = produits;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public byte[] getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(byte[] nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	private Collection<Produit> produits=new ArrayList<Produit>();

}
*/