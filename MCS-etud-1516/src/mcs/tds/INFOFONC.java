package mcs.tds;

import java.util.LinkedHashMap;

import mcs.gc.Emplacement;
import mcs.type.DTYPE;

/**
 * Cette classe décrit une fonction: 
 *  le type de retour, 
 *  les paramètres d'entrée, 
 *  l'étiquette( nom+emplacement );
 *  
 * 
 * @author qi
 */
public class INFOFONC implements INFO{

	protected DTYPE Rtype;
	protected LinkedHashMap<String, INFO> paras;
	protected String etiq;
	
	public DTYPE getRtype() {
		return Rtype;
	}

	public LinkedHashMap<String, INFO> getParas() {
		return paras;
	}

	public String getEtiq() {
		return etiq;
	}

	public INFOFONC(String nom, DTYPE type, LinkedHashMap<String,INFO> para, Emplacement e){
		this.Rtype =type;
		this.paras = para;
		this.etiq = nom+e.toString();
	}
	public String toString(){
		return ";FONC: étiquette:"+etiq+" ,type de retour:"+Rtype+" ,paras d'entrée:"+paras+'\n';
	}
}
