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
	protected ArrayList<SURCHARGE> parasSurcharge;
	protected TDS tds; //TDS des variables locaux

	public ArrayList<SURCHARGE> getParasSurcharge() {
		return parasSurcharge;
	}
	
	public DTYPE getRtype() {
		return Rtype;
	}

	public TDS getTds() {
		return tds;
	}

	public void setTds(TDS t) {
		this.tds = t;
	}
	
	public INFOFONC(DTYPE type, ArrayList<SURCHARGE> surcharges, TDS t){
		this.Rtype =type;
		this.tds = t;
		this.parasSurcharge = surcharges;
	}
	
	public String getEtiq() {
		return this.getSurcharge(0).getEtiq().split("X0")[0];
	}
	
	public int addSurcharge(String nom) {
		int num_surcharge = this.getParasSurcharge().size();
		this.getParasSurcharge().add(new SURCHARGE(new LinkedHashMap<String,INFOVAR>(),"_" + nom + "X" + num_surcharge));
		return num_surcharge;
	}
	
	public int mmParas(ArrayList<DTYPE> list){
		int result = -1;
		for (int i=0; i< this.getParasSurcharge().size(); i++) {
			Collection<INFOVAR> col = this.getParasSurcharge().get(i).getParas().values();
			if (col.size() == list.size()) {
				int j =0;
				boolean correct = true;
				for ( INFOVAR in: col){
					correct = correct & (in.getType().compareTo(list.get(j)));
					j++;
				}
				if (correct) {
					result = i;
				}
			}
		}
		return result;
	}
	
	public int mmParas(LinkedHashMap<String, INFOVAR> list){
		int result = -1;
		INFOVAR[] tab;
		tab = list.values().toArray(new INFOVAR[0]);
		for (int i=0; i< this.getParasSurcharge().size(); i++) {
			Collection<INFOVAR> col = this.getParasSurcharge().get(i).getParas().values();
			if (col.size() == tab.length) {
				int j =0;
				boolean correct = true;
				for ( INFOVAR in: col){
					correct = correct & (in.getType().compareTo(tab[j].getType()));
					j++;
				}
				if (correct) {
					result = i;
				}
			}
		}
		return result;
	}
	

	public String toString() {
		String s = "FONCS : type de retour: " + this.getRtype() + " , liste des surcharges :\n";
		for (SURCHARGE surcharge : parasSurcharge) {
			s += surcharge.toString();
		}
		return s;
	}

	public SURCHARGE getSurcharge (int num_s) {
		return this.parasSurcharge.get(num_s);
	
	}
	
}
