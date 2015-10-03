package com.olivier.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1785362957894467377L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	//private Integer nom;
	
	public User(){
		
	}
	
	/*public User(Integer nom){
		this.nom=nom;
	}
	
	public User(Integer id, Integer nom){
		this.id=id;
		this.nom=nom;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/*public int getNom() {
		return nom;
	}
	public void setNom(Integer nom) {
		this.nom = nom;
	}*/
	
	
}
