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
public class S_INST_MCS {
LEX_MCS scanner;
  S_INST_MCS() {
    }
  S_INST_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  INFOFONC att_infofon;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  int att_dep;
  private void regle30() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_7 = new S_BLOC_MCS(scanner,att_eval) ;
    S_SIX_MCS x_8 = new S_SIX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_4, x_7, x_8);
    x_2.analyser(LEX_MCS.token_si);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_tds_30(x_4, x_7, x_8);
    x_7.analyser() ;
    x_8.analyser() ;
if  (att_eval)      action_code_30(x_4, x_7, x_8);
  }
  private void regle33() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_33(x_3);
    x_2.analyser(LEX_MCS.token_retour);
    x_3.analyser() ;
if  (att_eval)      action_type_33(x_3);
    x_5.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_code_33(x_3);
  }
  private void regle27() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_AFFX_MCS x_5 = new S_AFFX_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_27(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_type_27(x_2, x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_tds_27(x_2, x_3, x_5);
  }
  private void regle29() throws Exception {

    //declaration
    S_BLOC_MCS x_3 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_29(x_3);
if  (att_eval)      action_gen_29(x_3);
    x_3.analyser() ;
if  (att_eval)      action_code_29(x_3);
  }
  private void regle28() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_code_28(x_2);
  }
private void action_type_33(S_E_MCS x_3) throws Exception {
try {
// locales
DTYPE loc_t;
// instructions
loc_t=this.att_infofon.getRtype();
if (!((loc_t.compareTo(x_3.att_type)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_05, MCSMessages.B_05,new Object[]{""+"mauvais type de retour"+this.att_infofon.getEtiq()});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","INST -> retour E #type pv #code ;"});
}
  }
private void action_tds_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
// instructions
loc_i=this.att_tds.ChercherGlobalement(x_3.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_05, MCSMessages.B_05,new Object[]{""+x_3.att_txt});

}
else {
loc_iv= new INFOVAR(x_3.att_txt, x_2.att_type);
this.att_tds.inserer(loc_iv);
this.att_code=x_5.att_code;
this.att_dep=this.att_hdep+x_2.att_type.getTaille();
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> TYPE ident #type AFFX pv #tds ;"});
}
  }
private void action_auto_inh_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> TYPE ident #type AFFX pv #tds ;"});
}
  }
private void action_auto_inh_28(S_E_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> E pv #code ;"});
}
  }
private void action_auto_inh_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_hdep=this.att_hdep;
x_3.att_infofon=this.att_infofon;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> #gen BLOC #code ;"});
}
  }
private void action_type_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_htype=x_2.att_type;
x_5.att_hcode="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","INST -> TYPE ident #type AFFX pv #tds ;"});
}
  }
private void action_code_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIf(x_4.att_code, x_7.att_code, x_8.att_code);
this.att_dep=x_7.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INST -> si paro E parf #tds BLOC SIX #code ;"});
}
  }
private void action_tds_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// locales
TDS loc_t;
// instructions
loc_t= new TDS(this.att_tds);
x_7.att_tds=loc_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> si paro E parf #tds BLOC SIX #code ;"});
}
  }
private void action_auto_inh_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_7.att_hdep=this.att_hdep;
x_8.att_hdep=this.att_hdep;
x_4.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
x_7.att_infofon=this.att_infofon;
x_8.att_infofon=this.att_infofon;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> si paro E parf #tds BLOC SIX #code ;"});
}
  }
private void action_code_33(S_E_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
this.att_dep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INST -> retour E #type pv #code ;"});
}
  }
private void action_gen_29(S_BLOC_MCS x_3) throws Exception {
try {
// locales
TDS loc_t;
// instructions
loc_t= new TDS(this.att_tds);
x_3.att_tds=loc_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> #gen BLOC #code ;"});
}
  }
private void action_auto_inh_33(S_E_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> retour E #type pv #code ;"});
}
  }
private void action_code_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
this.att_dep=x_3.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INST -> #gen BLOC #code ;"});
}
  }
private void action_code_28(S_E_MCS x_2) throws Exception {
try {
// instructions
this.att_code=x_2.att_code;
this.att_dep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INST -> E pv #code ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 10842
        regle27 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle27 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle27 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle27 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle27 () ;
      break ;
      case LEX_MCS.token_entier : // 10865
        regle28 () ;
      break ;
      case LEX_MCS.token_caractere : // 10866
        regle28 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle28 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle28 () ;
      break ;
      case LEX_MCS.token_non : // 10864
        regle28 () ;
      break ;
      case LEX_MCS.token_null : // 10850
        regle28 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle28 () ;
      break ;
      case LEX_MCS.token_mult : // 10860
        regle28 () ;
      break ;
      case LEX_MCS.token_ident : // 10868
        regle28 () ;
      break ;
      case LEX_MCS.token_aco : // 10834
        regle29 () ;
      break ;
      case LEX_MCS.token_si : // 10840
        regle30 () ;
      break ;
      case LEX_MCS.token_retour : // 10848
        regle33 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
