package mcs.tds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

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
	protected LinkedHashMap<String, INFOVAR> paras;
	protected TDS tds; //TDS des variables locaux
	protected String etiq;
	
	public DTYPE getRtype() {
		return Rtype;
	}

	public LinkedHashMap<String, INFOVAR> getParas() {
		return paras;
	}

	public String getEtiq() {
		return etiq;
	}

	public TDS getTds() {
		return tds;
	}

	public INFOFONC(String nom, DTYPE type, LinkedHashMap<String,INFOVAR> para, TDS t){
		this.Rtype =type;
		this.paras = para;
		this.etiq = nom;
		this.tds = t;
	}
	
	public int getTailleParas() {
		int taille = 0;
		for(Entry<String, INFOVAR> entry : paras.entrySet()) {
		    taille += entry.getValue().getType().getTaille();
		}
		return taille;
	}
	
	public String toString(){
		return ";FONC: étiquette:"+etiq+" ,type de retour:"+Rtype+" ,paras d'entrée:"+paras+'\n';
	}
	
	public boolean mmPara(ArrayList list){
		
		Collection<INFOVAR> col = this.getParas().values();
		int i =0;
		boolean result= true; 
		for ( INFOVAR in: col){
			result = result & (in.getType().compareTo( (DTYPE) list.get(i)));
			i++;
		}
		return result;
	} 
	
}
