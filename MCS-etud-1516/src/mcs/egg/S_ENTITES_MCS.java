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
public class S_ENTITES_MCS {
LEX_MCS scanner;
  S_ENTITES_MCS() {
    }
  S_ENTITES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  String att_hcode;
  int att_dep;
  private void regle2() throws Exception {

    //declaration
    S_ENTITE_MCS x_2 = new S_ENTITE_MCS(scanner,att_eval) ;
    S_ENTITES_MCS x_4 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_hdep_2(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_dep_2(x_2, x_4);
  }
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_dep_1();
  }
private void action_dep_1() throws Exception {
try {
// instructions
this.att_dep=this.att_hdep;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","ENTITES -> #dep ;"});
}
  }
private void action_hdep_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hdep=x_2.att_dep;
x_4.att_hcode=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hdep","ENTITES -> ENTITE #hdep ENTITES1 #dep ;"});
}
  }
private void action_dep_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
this.att_dep=x_4.att_dep;
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","ENTITES -> ENTITE #hdep ENTITES1 #dep ;"});
}
  }
private void action_auto_inh_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_hdep=this.att_hdep;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITES -> ENTITE #hdep ENTITES1 #dep ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.EOF :
        regle1 () ;
      break ;
      case LEX_MCS.token_typedef : // 10847
        regle2 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle2 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle2 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle2 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle2 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
