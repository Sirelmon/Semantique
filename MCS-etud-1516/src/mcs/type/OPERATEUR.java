package mcs.type;

import java.util.Collection;

public enum OPERATEUR{
	OPB_inf ("int"),
	OPB_sup ("int"),
	OPB_infeg ("int"),
	OPB_supeg ("int"),
	OPB_eg ("int","char"),
	OPB_neg ("int","char"),
	OPB_plus ("int","char","string"),  
	OPB_moins ("int"),
	OPB_ou ("int","bool"),
	OPB_mult("int"),
	OPB_div ("int"),
	OPB_mod ("int"),
	OPB_et ("int","bool"),
	OPU_plus ("int"),
	OPU_moins ("int"),
	OPU_non ("int","bool");

	
	Collection<String> typesAdmis;
	
	OPERATEUR (String... types ) {
		for (String type : types) {
			typesAdmis.add(type);
		}
	}
	
	
	public Collection<String> getAdmis() {
		return this.typesAdmis;
	}
	
	public OPERATEUR op(int i) {
		switch (i) {
		case 0 :
			return OPERATEUR.OPB_inf;
		case 1 :
			return OPERATEUR.OPB_sup;
		case 2 :
			return OPERATEUR.OPB_infeg;
		case 3 :
			return OPERATEUR.OPB_supeg;
		case 4 :
			return OPERATEUR.OPB_eg;
		case 5 :
			return OPERATEUR.OPB_neg;
		case 6 :
			return OPERATEUR.OPB_plus;  
		case 7 :
			return OPERATEUR.OPB_moins;
		case 8 :
			return OPERATEUR.OPB_ou;
		case 9 :
			return OPERATEUR.OPB_mult;
		case 10 :
			return OPERATEUR.OPB_div;
		case 11 :
			return OPERATEUR.OPB_mod;
		case 12 :
			return OPERATEUR.OPB_et;
		case 13 :
			return OPERATEUR.OPU_plus;
		case 14 :
			return OPERATEUR.OPU_moins;
		case 15 :
			return OPERATEUR.OPU_non;
		default :
			return OPERATEUR.OPB_eg;
		}
	}
	
}
