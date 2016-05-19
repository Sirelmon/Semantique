package mcs.type;

import java.util.Collection;

public enum OPERATEUR{
	OPB_INF ("int"),
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
	
}
