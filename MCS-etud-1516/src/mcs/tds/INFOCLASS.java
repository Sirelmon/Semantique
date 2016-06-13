package mcs.tds;

import mcs.type.*;

public class INFOCLASS implements INFO {

	
	private TDS tds;
	private DTYPE type;
	
	public INFOCLASS(TDS tds, String nomType) {
		this.type = new DTYPE(nomType, 0);
		this.tds = tds;				
	}
	
	public void addAttribut(String nom, INFOVAR attribut) {
		DTYPE type = this.type;
		type.setTaille(type.getTaille() + attribut.getType().getTaille());
		this.tds.inserer(nom, attribut);
	}
	
	public DTYPE getType() {
		return this.type;
	}

	public TDS getTds() {
		return tds;
	}
}
