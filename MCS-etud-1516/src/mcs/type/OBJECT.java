package mcs.type;

import mcs.tds.INFO;
import mcs.tds.INFOVAR;
import mcs.tds.TDS;

public class OBJECT extends DTYPE {
	
	protected TDS tds;
	
	public OBJECT() {
		super("object",0);
		this.tds = new TDS();
	}
	
	public OBJECT(OBJECT heritage) {
		super("object",heritage.getTaille());
		this.tds = new TDS(heritage.tds);
	}
		
	public TDS getTds() {
		return tds;
	}
	
	public void majTaille(DTYPE type) {
		this.taille += type.getTaille(); 
	}
	
	public void setTaille() {
		int taille = 0;
		for (INFO i : tds.values()) {
			if (i instanceof INFOVAR) {
				taille += ((INFOVAR) i).getTaille();
			}
		}
	}
}
