package mcs.type;

import java.util.ArrayList;
import java.util.Collection;

public class OPERATEUR {
	
	public int num;
	public Collection<String> typesAdmis;
		
	public OPERATEUR(int num) {
			this.num = num;
			this.typesAdmis = new ArrayList<String>();
			switch (num) {
			//OPB inf
			case 0 :
				this.typesAdmis.add("int");
			//OPB sup
			case 1 :
				this.typesAdmis.add("int");
			//OPB infeg
			case 2 :
				this.typesAdmis.add("int");
			//OPB supeg
			case 3 :
				this.typesAdmis.add("int");
			//OPB eg
			case 4 :
				this.typesAdmis.add("int");
				this.typesAdmis.add("char");
			//OPB neg
			case 5 :
				this.typesAdmis.add("int");
			//OPB plus
			case 6 :
				this.typesAdmis.add("int");
				this.typesAdmis.add("char");
				this.typesAdmis.add("string");
			//OPB moins
			case 7 :
				this.typesAdmis.add("int");
			//OPB ou
			case 8 :
				this.typesAdmis.add("int");
				this.typesAdmis.add("bool");
			//OPB mult
			case 9 :
				this.typesAdmis.add("int");
			//OPB div
			case 10 :
				this.typesAdmis.add("int");
			//OPB mod	
			case 11 :
				this.typesAdmis.add("int");
			//OPB et	
			case 12 :
				this.typesAdmis.add("int");
				this.typesAdmis.add("et");
			//OPB plus
			case 13 :
				this.typesAdmis.add("int");
			//OPB moins
			case 14 :
				this.typesAdmis.add("int");
			//OPB non
			case 15 :
				this.typesAdmis.add("int");
				this.typesAdmis.add("bool");
				
			default :
				
			}
	}
	
	public Collection<String> getAdmis() {
		return this.typesAdmis;
	}
	
	public int getNum() {
		return this.num;
	}

	public Collection<String> getTypesAdmis() {
		return typesAdmis;
	}
}
