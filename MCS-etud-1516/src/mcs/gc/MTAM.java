package mcs.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import mcs.tds.INFOTYPE;
import mcs.tds.INFOVAR;
import mcs.type.DTYPE;
import mcs.type.OPERATEUR;

/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {

	@Override
	public String getSuffixe() {
		return "tam";
	}

	private String nom;

	public MTAM(String fname) {
		if (fname.endsWith(".bloc")) {
			nom = fname.substring(0, fname.length() - 5);
		} else {
			nom = fname;
		}
	}

	public String genFonction(String etiquette, int taillepars,
			int tailleretour, String code) {
		return "_" + etiquette + ":\n" + code + "\tRETURN (" + tailleretour + ") "
				+ taillepars + "\n";

	}

	public String genCall(String etiquette) {
		return "; Appel a " + etiquette + "\n" + "\tCALL(SB) _" + etiquette
				+ "\n";
	}

	// genere le code pour une declaration (avec initialisation)
	public String genDecl(String n, INFOVAR i, String t) {
		int taille = i.getType().getTaille();
		return "   ; declaration de " + n + " en " + i.getEmpl() + "/LB"
				+ " taille = " + taille + "\n" + t + "; fin de declaration de "
				+ n + "\n";
	}

	// compteur pour le generateur d'etiquettes
	private static int cpt = 0;

	// genere une etiquette differente des autres
	public String genEtiq() {
		return "X" + cpt++;
	}

	// genere le code pour l'arret de la machine
	public String genFin() {
		return "\tHALT\n";
	}

	public void genAsm(String nomf, String code) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(nom + ".tam"));
			pw.println(";;; code TAM engendre pour " + nom + "\n");
			pw.print(genCall(nomf));
			pw.print(genFin());
			pw.print(code);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String genPush(DTYPE type) {
		int taille = type.getTaille();
		return "\tPUSH " + taille + "\n";
	}
	
	public String genCst(String v) {
		return "\tLOADL " + v + "\n";
	}
	
	
	public String genFree(int i) {
		// TODO Auto-generated method stub
		return "\tPOP(0)" + i + "\n";
	}

	public String genReadMem(int dep, int taille) {
		// TODO Auto-generated method stub
		return "\tLOAD(" + taille + ") " + dep + "[LB]\n";
	}

	public String genWriteMem(int dep, int taille) {
		// TODO Auto-generated method stub
		return "\tSTORE(" + taille + ") " + dep + "[LB]\n";
	}

	public String genReadIndirectMem(int taille) {
		// TODO Auto-generated method stub
		return "\tLOADI(" + taille + ")\n";
	}

	public String genWriteIndirectMem(int taille) {
		// TODO Auto-generated method stub
		return "\tSTOREI(" + taille + ")\n";
	}

	public String genIf(String code, String code2, String code3) {
		String sinon = genEtiq();
		String fin = genEtiq();
		return "\t; if\n" + code + "\n" + "\tJUMPIF(0) " + sinon + "\n" + code2
				+ "\n" + "\tJUMP " + fin + "\n" + sinon + "\n" + code3 + "\n"
				+ fin + "\n" + "\t; fin if\n";
	}

	public String genMalloc(int taille) {
		return "\tLOADL " + taille + "\n" + "\tSUBR Malloc\n";
	}

	public String genAdr(int dep) {
		return "\tLOADA " + dep + "[LB]\n";
	}

	public String genAdrField(int dep) {
		return "\t;Calcul deplacement struct " + dep + "\n" + "\tLOADL " + dep
				+ "\n\tSUBR Iadd\n";
	}

	public String genNull() {
		return "\tSUBR MVoid\n";
	}
	
	public String genSubr(OPERATEUR op, DTYPE type) {
		if (type.getNom().equals("int")) {
			switch (op.getNum())
			{
				// OPB_inf
				case 0 :
					return "\tSUBR ILss\n";
				// OPB_sup 
				case 1 :
					return "\tSUBR IGtr\n";
				// OPB_infeg
				case 2 :
					return "\tSUBR ILeq\n";
				// OPB_supeg 
				case 3 :
					return "\tSUBR IGeq\n";
				// OPB_eg
				case 4 :
					return "\tSUBR IEq\n";
				// OPB_neg 
				case 5 :
					return "\tSUBR INeq\n";
				// OPB_plus 
				case 6 :
					return "\tSUBR IAdd\n";
				// OPB_moins
				case 7 :
					return "\tSUBR ISub\n";
				// OPB_ou
				case 8 :
					return "\tSUBR BOr\n";
				// OPB_mult
				case 9 :
					return "\tSUBR IMul\n";
				// OPB_div
				case 10 :
					return "\tSUBR IDiv\n";
				// OPB_mod
				case 11 :
					return "\tSUBR IMod\n";
				// OPB_et
				case 12 :
					return "\tSUBR BAnd\n";
				// OPU_plus
				case 13 :
					return "";
				// OPU_moins
				case 14 :
					return "\tSUBR INeg\n";
				// OPU_non
				case 15 :
					return "\tSUBR BNeg\n";
				default :
					return "";
			}
		} else if (type.getNom().equals("char")) {
			switch (op.getNum())
			{
				// OPB_eg
				case 4 :
					return "\tSUBR IEg\n";
				// OPB_neg
				case 5 :
					return "\tSUBR INeq\n";
				// OPB_plus
				case 6 :
					return "\tSUBR SConcat\n";
				default :
					return "";
			}
		} else if (type.getNom().equals("string")) {
			switch (op.getNum())
			{
				// OPB_plus
				case 6 :
					return "\tSUBR SConcat\n";
				default :
					return "";
			}
		} else if (type.getNom().equals("bool")) {
			switch (op.getNum())
			{
				// OPB_ou
				case 8 :
					return "\tSUBR BOr\n";
				// OPB_et
				case 12 :
					return "\tSUBR BAnd\n";
				// OPU_non
				case 15 :
					return "\tSUBR BNeg\n";
				default :
					return "";
			}
		} else {
			return "";
		}
	}
	
	public String genComment(String c) {
		return "; " + c + "\n";
	}
}

