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
public class S_DECL_MCS {
LEX_MCS scanner;
  S_DECL_MCS() {
    }
  S_DECL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  boolean att_est_fonction;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  String att_nom;
  private void regle6() throws Exception {

    //declaration
    S_FONCTION_MCS x_3 = new S_FONCTION_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_6(x_3);
if  (att_eval)      action_def_6(x_3);
    x_3.analyser() ;
if  (att_eval)      action_fct_6(x_3);
  }
  private void regle5() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_def_5();
  }
private void action_fct_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
this.att_est_fonction=true;
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#fct","DECL -> #def FONCTION #fct ;"});
}
  }
private void action_auto_inh_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DECL -> #def FONCTION #fct ;"});
}
  }
private void action_def_5() throws Exception {
try {
// locales
INFO loc_i;
INFOTYPE loc_it;
// instructions
loc_i=this.att_tds.chercherGlobalement(this.att_nom);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_01, MCSMessages.B_01,new Object[]{""+this.att_nom});

}
else {
loc_i= new INFOTYPE(this.att_htype);
    this.att_tds.inserer(this.att_nom, loc_i);
this.att_est_fonction=false;
this.att_code="";
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#def","DECL -> pv #def ;"});
}
  }
private void action_def_6(S_FONCTION_MCS x_3) throws Exception {
try {
// locales
INFO loc_i;
INFOFONC loc_iff;
LinkedHashMap loc_m;
// instructions
loc_m= new LinkedHashMap();
loc_i=this.att_tds.chercherGlobalement(this.att_nom);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_01, MCSMessages.B_01,new Object[]{""+this.att_nom});

}
else {
x_3.att_htype=this.att_htype;
    this.att_tds.inserer(this.att_nom, loc_i);
loc_iff= new INFOFONC(this.att_nom, this.att_htype, loc_m, this.att_tds);
x_3.att_infofon=loc_iff;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#def","DECL -> #def FONCTION #fct ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_pv : // 10838
        regle5 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
