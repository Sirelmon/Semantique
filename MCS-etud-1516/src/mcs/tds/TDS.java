package mcs.tds;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * une TDS hiérarchique.
 * 
 * @author marcel
 * 
 */
public class TDS extends HashMap<String, INFO> {

	private static final long serialVersionUID = 1L;

	/**
	 * La TDS parente
	 */
	private TDS parente;

	/**
	 * Constructeur pour une TDS sans parente
	 */
	public TDS() {
		this(null);
	}

	/**
	 * Constructeur pour une TDS fille de p
	 * 
	 * @param p
	 */
	public TDS(TDS p) {
		super();
		parente = p;
	}

	public TDS getParente() {
		return parente;
	}

	/**
	 * Recherche de n dans la TDS courante uniquement
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherLocalement(String n) {
		return get(n);
	}

	/**
	 * Recherche de n dans la TDS courante et ses parentes.
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherGlobalement(String n) {
		INFO i = chercherLocalement(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(n);
		return i;
	}

	/**
	 * Ajoute le nom n et son information i dans la TDS
	 * 
	 * @param n
	 * @param i
	 */
	public void inserer(String n, INFO i) {
		put(n, i);
	}
	
	public int getTailleLocales() {
		int somme = 0;
		for (INFO i : this.values()) {
			if (i instanceof INFOVAR) {
			somme += ((INFOVAR) i).getType().getTaille();
			}
		}
		return somme;
	}
	
	public boolean sansFonction() {
		Collection<INFO> col = this.values();
		int cpt = 0;
		for (INFO info : col) {
			if (info instanceof INFOFONC) {
				cpt += ((INFOFONC) info).getParasSurcharge().size();
			}
		}
		return (cpt==1);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			sb.append("; " + e.getKey() + " : " + e.getValue() + '\n');

		}
		return sb.toString();
	}

}
