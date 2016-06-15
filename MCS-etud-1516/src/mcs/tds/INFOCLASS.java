package mcs.tds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import mcs.type.*;

public class INFOCLASS implements INFO {

	private LCHAMPS attributs;
	private HashMap<String, INFOFONC> methodes;
	private INFOCLASS heritage;
	
	public INFOCLASS(String nomType, INFOCLASS heritage) {
		this.attributs = new LCHAMPS();
		this.methodes = new HashMap<String, INFOFONC>();
		this.heritage = heritage;
	}
	
	public void addAttribut(String nom, DTYPE type) {
		CHAMP c = new CHAMP(nom, type, this.attributs.getTaille());
		this.attributs.add(c);
	}
	
	public int getTaille() {
		return this.attributs.getTaille();
	}

	public void addMethod(String nom, INFOFONC fonction) {
		if (this.methodes.containsKey(nom)) {
			this.methodes.get(nom).getParasSurcharge().add(fonction.getSurcharge(0));
		} else {
			this.methodes.put(nom, fonction);
		}
	}
	
	public INFOCLASS getHeritage() {
		return heritage;
	}

	public LCHAMPS getAttributs() {
		return attributs;
	}

	public HashMap<String, INFOFONC> getMethodes() {
		return methodes;
	}


}

