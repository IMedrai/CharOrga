package com.orga.models;

import java.util.Date;

public class PP {
	private String cin;
	private String numero;
	private String nomFr;
	private String nomAng;
	private String nomAr;
	private String prenomFr;
	private String prenomAng;
	private String prenomAr;
	private String sexe;
	private String nationalite;
	private Date dateNaissance;
	private String lieuNaissance;
	private String type;
	private String sousType;
	private String email;
	private String pays;
	private String ville;
	private String profession;
	private String fonction;
	private String autreNumero;
	private String langue;
	
	
	
	public PP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNomFr() {
		return nomFr;
	}
	public void setNomFr(String nomFr) {
		this.nomFr = nomFr;
	}
	public String getNomAng() {
		return nomAng;
	}
	public void setNomAng(String nomAng) {
		this.nomAng = nomAng;
	}
	public String getNomAr() {
		return nomAr;
	}
	public void setNomAr(String nomAr) {
		this.nomAr = nomAr;
	}
	public String getPrenomFr() {
		return prenomFr;
	}
	public void setPrenomFr(String prenomFr) {
		this.prenomFr = prenomFr;
	}
	public String getPrenomAng() {
		return prenomAng;
	}
	public void setPrenomAng(String prenomAng) {
		this.prenomAng = prenomAng;
	}
	public String getPrenomAr() {
		return prenomAr;
	}
	public void setPrenomAr(String prenomAr) {
		this.prenomAr = prenomAr;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSousType() {
		return sousType;
	}
	public void setSousType(String sousType) {
		this.sousType = sousType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getAutreNumero() {
		return autreNumero;
	}
	public void setAutreNumero(String autreNumero) {
		this.autreNumero = autreNumero;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public PP(String cin, String numero, String nomFr, String nomAng, String nomAr, String prenomFr, String prenomAng,
			String prenomAr, String sexe, String nationalite, Date dateNaissance, String lieuNaissance, String type,
			String sousType, String email, String pays, String ville, String profession, String fonction,
			String autreNumero, String langue) {
		super();
		this.cin = cin;
		this.numero = numero;
		this.nomFr = nomFr;
		this.nomAng = nomAng;
		this.nomAr = nomAr;
		this.prenomFr = prenomFr;
		this.prenomAng = prenomAng;
		this.prenomAr = prenomAr;
		this.sexe = sexe;
		this.nationalite = nationalite;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.type = type;
		this.sousType = sousType;
		this.email = email;
		this.pays = pays;
		this.ville = ville;
		this.profession = profession;
		this.fonction = fonction;
		this.autreNumero = autreNumero;
		this.langue = langue;
	}



	@Override
	public String toString() {
		return "PP [cin=" + cin + ", numero=" + numero + ", nomFr=" + nomFr + ", nomAng=" + nomAng + ", nomAr=" + nomAr
				+ ", prenomFr=" + prenomFr + ", prenomAng=" + prenomAng + ", prenomAr=" + prenomAr + ", sexe=" + sexe
				+ ", nationalite=" + nationalite + ", dateNaissance=" + dateNaissance + ", lieuNaissance="
				+ lieuNaissance + ", type=" + type + ", sousType=" + sousType + ", email=" + email + ", pays=" + pays
				+ ", ville=" + ville + ", profession=" + profession + ", fonction=" + fonction + ", autreNumero="
				+ autreNumero + ", langue=" + langue + "]";
	}
	
	
	

}
