package com.orga.models;

public class PM {
	private String numero;
	private String raisonSociale;
	private String libelleFr;	
	private String libelleAng;	
	private String libelleAr;	
	private String type;
	private String sousType;
	private String pays;
	private String ville;	
	private String patente;	
	private String sigle;	
	private String formeJuridique;	
	private String localite;
	private String langue;
	
	public PM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getLibelleFr() {
		return libelleFr;
	}

	public void setLibelleFr(String libelleFr) {
		this.libelleFr = libelleFr;
	}

	public String getLibelleAng() {
		return libelleAng;
	}

	public void setLibelleAng(String libelleAng) {
		this.libelleAng = libelleAng;
	}

	public String getLibelleAr() {
		return libelleAr;
	}

	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
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

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public PM(String numero, String raisonSociale, String libelleFr, String libelleAng, String libelleAr, String type,
			String sousType, String pays, String ville, String patente, String sigle, String formeJuridique,
			String localite, String langue) {
		super();
		this.numero = numero;
		this.raisonSociale = raisonSociale;
		this.libelleFr = libelleFr;
		this.libelleAng = libelleAng;
		this.libelleAr = libelleAr;
		this.type = type;
		this.sousType = sousType;
		this.pays = pays;
		this.ville = ville;
		this.patente = patente;
		this.sigle = sigle;
		this.formeJuridique = formeJuridique;
		this.localite = localite;
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "PM [numero=" + numero + ", raisonSociale=" + raisonSociale + ", libelleFr=" + libelleFr
				+ ", libelleAng=" + libelleAng + ", libelleAr=" + libelleAr + ", type=" + type + ", sousType="
				+ sousType + ", pays=" + pays + ", ville=" + ville + ", patente=" + patente + ", sigle=" + sigle
				+ ", formeJuridique=" + formeJuridique + ", localite=" + localite + ", langue=" + langue + "]";
	}

	
	

}
