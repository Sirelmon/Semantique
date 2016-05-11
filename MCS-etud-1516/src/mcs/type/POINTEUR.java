package mcs.type;

public class POINTEUR extends DTYPE {
	private DTYPE typeP;//type pointé

	public POINTEUR(DTYPE t) {
		super("pointeur", 1);
		typeP = t;
	}

	public DTYPE getTypeP() {
		return typeP;
	}
	public boolean compareTo(DTYPE autre) {
		if (autre instanceof POINTEUR)
			return typeP.compareTo(((POINTEUR) autre).typeP);
		return false;
	}


	public String toString(){
		return super.toString() + " sur type = " + typeP;
	}



}
