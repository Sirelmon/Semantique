package mcs.tds;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SURCHARGE {

	protected LinkedHashMap<String, INFOVAR> paras;
	protected String etiq;
	
	public SURCHARGE (LinkedHashMap<String, INFOVAR> paras, String etiq) {
		this.paras = paras;
		this.etiq = etiq;
	}
	
	
	public LinkedHashMap<String, INFOVAR> getParas() {
		return paras;
	}
	public void setParas(LinkedHashMap<String, INFOVAR> paras) {
		this.paras = paras;
	}
	
	public String getEtiq() {
		return etiq;
	}
	public void setEtiq(String etiq) {
		this.etiq = etiq;
	}
	
	public int getTailleParas() {
		int taille = 0;
		for(Entry<String, INFOVAR> entry : paras.entrySet()) {
		    taille += entry.getValue().getType().getTaille();
		}
		return taille;
	}
	
	public String toString(){
		return ";FONC: étiquette:"+etiq+" ,paras d'entrée:"+paras+'\n';
	}
}