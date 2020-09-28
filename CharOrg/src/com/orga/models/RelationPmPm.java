package com.orga.models;

import java.util.Date;

public class RelationPmPm {
	private String numeroPmMere;
	private String typeRelation;
	private String sousTypeRelation;	
	private String numeroPmFille;	
	private Date dateDebut;	
	private Date dateFin;
	public RelationPmPm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumeroPmMere() {
		return numeroPmMere;
	}
	public void setNumeroPmMere(String numeroPmMere) {
		this.numeroPmMere = numeroPmMere;
	}
	public String getTypeRelation() {
		return typeRelation;
	}
	public void setTypeRelation(String typeRelation) {
		this.typeRelation = typeRelation;
	}
	public String getSousTypeRelation() {
		return sousTypeRelation;
	}
	public void setSousTypeRelation(String sousTypeRelation) {
		this.sousTypeRelation = sousTypeRelation;
	}
	public String getNumeroPmFille() {
		return numeroPmFille;
	}
	public void setNumeroPmFille(String numeroPmFille) {
		this.numeroPmFille = numeroPmFille;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public RelationPmPm(String numeroPmMere, String typeRelation, String sousTypeRelation, String numeroPmFille,
			Date dateDebut, Date dateFin) {
		super();
		this.numeroPmMere = numeroPmMere;
		this.typeRelation = typeRelation;
		this.sousTypeRelation = sousTypeRelation;
		this.numeroPmFille = numeroPmFille;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	@Override
	public String toString() {
		return "RelationPmPm [numeroPmMere=" + numeroPmMere + ", typeRelation=" + typeRelation + ", sousTypeRelation="
				+ sousTypeRelation + ", numeroPmFille=" + numeroPmFille + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}
	

}
