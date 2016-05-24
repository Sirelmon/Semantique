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
public class S_SIX_MCS {
LEX_MCS scanner;
  S_SIX_MCS() {
    }
  S_SIX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle31() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_4 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_4);
    x_2.analyser(LEX_MCS.token_sinon);
if  (att_eval)      action_tds_31(x_4);
    x_4.analyser() ;
if  (att_eval)      action_code_31(x_4);
  }
  private void regle32() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_code_32();
  }
private void action_auto_inh_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hdep=this.att_hdep;
x_4.att_infofon=this.att_infofon;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","SIX -> sinon #tds BLOC #code ;"});
}
  }
private void action_code_32() throws Exception {
try {
// instructions
this.att_code="";
this.att_dep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","SIX -> #code ;"});
}
  }
private void action_tds_31(S_BLOC_MCS x_4) throws Exception {
try {
// locales
TDS loc_t;
// instructions
loc_t= new TDS(this.att_tds);
x_4.att_tds=loc_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","SIX -> sinon #tds BLOC #code ;"});
}
  }
private void action_code_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
this.att_dep=x_4.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","SIX -> sinon #tds BLOC #code ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_sinon : // 10841
        regle31 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle32 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle32 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle32 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle32 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle32 () ;
      break ;
      case LEX_MCS.token_entier : // 10865
        regle32 () ;
      break ;
      case LEX_MCS.token_caractere : // 10866
        regle32 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle32 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle32 () ;
      break ;
      case LEX_MCS.token_non : // 10864
        regle32 () ;
      break ;
      case LEX_MCS.token_null : // 10850
        regle32 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle32 () ;
      break ;
      case LEX_MCS.token_mult : // 10860
        regle32 () ;
      break ;
      case LEX_MCS.token_ident : // 10868
        regle32 () ;
      break ;
      case LEX_MCS.token_aco : // 10834
        regle32 () ;
      break ;
      case LEX_MCS.token_si : // 10840
        regle32 () ;
      break ;
      case LEX_MCS.token_retour : // 10848
        regle32 () ;
      break ;
      case LEX_MCS.token_acf : // 10835
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
