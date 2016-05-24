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
public class S_INSTS_MCS {
LEX_MCS scanner;
  S_INSTS_MCS() {
    }
  S_INSTS_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle26() throws Exception {

    //declaration
    S_INST_MCS x_2 = new S_INST_MCS(scanner,att_eval) ;
    S_INSTS_MCS x_4 = new S_INSTS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_26(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_hdep_26(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_code_26(x_2, x_4);
  }
  private void regle25() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_25();
  }
private void action_code_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
this.att_dep=x_4.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INSTS -> INST #hdep INSTS1 #code ;"});
}
  }
private void action_gen_25() throws Exception {
try {
// instructions
this.att_code="";
this.att_dep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> #gen ;"});
}
  }
private void action_auto_inh_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_hdep=this.att_hdep;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_infofon=this.att_infofon;
x_4.att_infofon=this.att_infofon;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INSTS -> INST #hdep INSTS1 #code ;"});
}
  }
private void action_hdep_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hdep=x_2.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hdep","INSTS -> INST #hdep INSTS1 #code ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 10835
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 10865
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 10866
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 10864
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 10850
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 10860
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 10868
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 10834
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 10840
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 10848
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
