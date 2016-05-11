package mcs.tds;

import mcs.type.DTYPE;

public class INFOTYPE implements INFO {

	// le nom 
	protected DTYPE type;
	protected int taille;
	
	public INFOTYPE(DTYPE dt,int t) {
		type = dt;
		taille = t;
	}
	
	public DTYPE getType() {
		return this.type;
	}
	
	public int getTaille() {
		return this.getTaille();
	}
	
	// affichage
	public String toString() {
		return "; INFOTYPE sur : " + "TAILLE =" + taille ;
	}

}