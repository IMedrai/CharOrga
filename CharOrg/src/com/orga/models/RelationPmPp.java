package com.orga.models;

import java.util.Date;

public class RelationPmPp {
	private String numeroPM;
	private String typeRelation;
	private String sousTypeRelation;	
	private String cinPP;	
	private Date dateDebut;	
	private Date dateFin;
	public RelationPmPp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumeroPM() {
		return numeroPM;
	}
	public void setNumeroPM(String numeroPM) {
		this.numeroPM = numeroPM;
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
	public String getCinPP() {
		return cinPP;
	}
	public void setCinPP(String cinPP) {
		this.cinPP = cinPP;
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
	public RelationPmPp(String numeroPM, String typeRelation, String sousTypeRelation, String cinPP, Date dateDebut,
			Date dateFin) {
		super();
		this.numeroPM = numeroPM;
		this.typeRelation = typeRelation;
		this.sousTypeRelation = sousTypeRelation;
		this.cinPP = cinPP;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	@Override
	public String toString() {
		return "RelationPmPp [numeroPM=" + numeroPM + ", typeRelation=" + typeRelation + ", sousTypeRelation="
				+ sousTypeRelation + ", cinPP=" + cinPP + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}
	
}
