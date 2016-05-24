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
public class S_ES_MCS {
LEX_MCS scanner;
  S_ES_MCS() {
    }
  S_ES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  ARRAYLIST att_paraset;
  LEX_MCS att_scanner;
  private void regle74() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_74();
  }
  private void regle75() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_4 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_htype_75(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_paraset_75(x_2, x_4);
  }
private void action_auto_inh_75(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> E #htype ESX #paraset ;"});
}
  }
private void action_gen_74() throws Exception {
try {
// locales
ArrayList loc_set;
// instructions
loc_set= new ArrayList();
this.att_paraset=loc_set;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ES -> #gen ;"});
}
  }
private void action_htype_75(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// locales
ArrayList loc_set;
// instructions
loc_set= new ArrayList();
loc_set.add(x_2.att_type);
x_4.att_hparaset=loc_set;
x_4.att_hcode=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","ES -> E #htype ESX #paraset ;"});
}
  }
private void action_paraset_75(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// locales
// instructions
this.att_paraset=x_4.att_paraset;
this.att_code=x_4.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#paraset","ES -> E #htype ESX #paraset ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 10833
        regle74 () ;
      break ;
      case LEX_MCS.token_entier : // 10865
        regle75 () ;
      break ;
      case LEX_MCS.token_caractere : // 10866
        regle75 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle75 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle75 () ;
      break ;
      case LEX_MCS.token_non : // 10864
        regle75 () ;
      break ;
      case LEX_MCS.token_null : // 10850
        regle75 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle75 () ;
      break ;
      case LEX_MCS.token_mult : // 10860
        regle75 () ;
      break ;
      case LEX_MCS.token_ident : // 10868
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
