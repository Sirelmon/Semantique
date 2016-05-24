package mcs.gc;

import mcs.compiler.MCSException;
import mcs.tds.INFOVAR;
import mcs.type.DTYPE;
import mcs.type.OPERATEUR;

/**
 * Cette interface décrit une machine cible. A compléter, selon votre modèle
 * 
 * @author marcel
 * 
 */
public interface IMachine {
	/**
	 * Suffixe du fichier cible (.tam par exemple)
	 * 
	 * @return
	 */
	String getSuffixe();

	/**
	 * Ecrit le code dans un fichier à partir du nom du fichier source et du
	 * suffixe
	 * 
	 * @param fileName
	 * @param code
	 * @throws MCSException
	 */

	void writeCode(String fileName, String code) throws MCSException;

	String genWriteIndirectMem(int taille);

	String genSubr(OPERATEUR att_op, DTYPE att_type);

	String genPush(DTYPE type);

	String genDecl(String att_txt, INFOVAR loc_iv, String genPush);

	String genReadIndirectMem(int taille);

	String genAdr(int dep);

	String genCall(String etiq);

	String genNull();

	String genReadMem(int dep, int taille);

	String genCst(String att_txt);

	String genFonction(String etiq, int loc_tailleparas, int taille, String att_code);

	String genAdrField(int dep);

	String genIf(String att_code, String att_code2, String att_code3);

	String genWriteMem(int dep, int taille);
	
	
	

}