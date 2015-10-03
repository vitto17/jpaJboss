package com.olivier.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage =  CacheConcurrencyStrategy.READ_ONLY)
public class Produit implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

//@NotEmpty
//private String designation;

private String description;

//private double prix;

public Produit(){
	
}

/*public Produit(Long idProduit, String designation, String description,
		double prix, String photo, int quantite) {
	super();
	this.id = idProduit;
	//this.designation = designation;
//	this.description = description;
	//this.prix = prix;
	//this.photo = photo;
	//this.quantite = quantite;
	//this.categorie = categorie;
}*/

public Long getIdProduit() {
	return id;
}

public void setIdProduit(Long idProduit) {
	this.id = idProduit;
}

/*public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}*/

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

/*public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}*/

/*public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}*/

/*public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}*/

/*private String photo;

private int quantite;

@ManyToOne
@JoinColumn(name="ID_CAT")
private Categorie categorie;*/
}
