package mcs.type;

import mcs.tds.INFO;
import mcs.tds.INFOVAR;
import mcs.tds.TDS;

public class OBJECT extends DTYPE {
	
	protected TDS tds;
	protected String nomClasse;
	
	public OBJECT(String nomClasse) {
		super("object",0);
		this.tds = new TDS();
		this.nomClasse = nomClasse;
	}
	
	public OBJECT(String nomClasse, OBJECT heritage) {
		super("object",heritage.getTaille());
		this.tds = new TDS(heritage.tds);
		this.nomClasse = nomClasse;
	}
	
	public boolean compareTo(DTYPE autre) {
		if (autre instanceof OBJECT)
			return (this.getNomClasse().equals(((OBJECT) autre).getNomClasse()));
		return false;
	}
	
	public TDS getTds() {
		return tds;
	}
	
	public String getNomClasse() {
		return nomClasse;
	}
	
	public void majTaille(DTYPE type) {
		this.taille += type.getTaille(); 
	}
	
	public void setTaille() {
		int somme = 0;
		for (INFO i : tds.values()) {
			if (i instanceof INFOVAR) {
				somme += ((INFOVAR) i).getTaille();
			}
		}
		this.taille = somme;
	}
}
