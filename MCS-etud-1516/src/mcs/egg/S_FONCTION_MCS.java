package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_FONCTION_MCS {
LEX_MCS scanner;
  S_FONCTION_MCS() {
    }
  S_FONCTION_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  INFOFONC att_infofon;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle7() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_4 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_7 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_4, x_7);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_tds_7(x_4, x_7);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_info_7(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_code_7(x_4, x_7);
  }
private void action_auto_inh_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FONCTION -> paro #tds PARFS parf #info BLOC #code ;"});
}
  }
private void action_tds_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// locales
TDS loc_t;
TDS loc_t2;
// instructions
loc_t= new TDS(this.att_tds);
x_4.att_tds=loc_t;
loc_t2= new TDS(loc_t);
x_7.att_tds=loc_t2;
this.att_infofon.setTDS(loc_t2);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","FONCTION -> paro #tds PARFS parf #info BLOC #code ;"});
}
  }
private void action_info_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// locales
TDS loc_t;
LinkedHashMap loc_m;
// instructions
loc_m=this.att_infofon.getParas();
loc_m.putAll(x_4.att_para);
x_7.att_infofon=this.att_infofon;
x_7.att_hdep=4;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#info","FONCTION -> paro #tds PARFS parf #info BLOC #code ;"});
}
  }
private void action_code_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// locales
DTYPE loc_t;
int loc_tailleparas;
// instructions
loc_tailleparas=this.att_infofon.getTailleParas();
loc_t=this.att_infofon.getRtype();
this.att_code=this.att_machine.genFonction(this.att_infofon.getEtiq(), loc_tailleparas, loc_t.getTaille(), x_7.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","FONCTION -> paro #tds PARFS parf #info BLOC #code ;"});
}
  }
  public void analyser () throws Exception {
    regle7 () ;
  }
  }
