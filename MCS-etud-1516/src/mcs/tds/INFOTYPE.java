package mcs.tds;

import mcs.type.DTYPE;

public class INFOTYPE implements INFO {

	// le type
	protected DTYPE type;
	
	public INFOTYPE(DTYPE dt) {
		type = dt;
	}
	
	public DTYPE getType() {
		return this.type;
	}
	// affichage
	public String toString() {
		return "; INFOTYPE sur : " + "TYPE =" + type ;
	}

}