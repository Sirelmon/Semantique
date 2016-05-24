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
public class S_ESX_MCS {
LEX_MCS scanner;
  S_ESX_MCS() {
    }
  S_ESX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  ARRAYLIST att_hparaset;
  IMachine att_machine;
  ARRAYLIST att_paraset;
  LEX_MCS att_scanner;
  String att_hcode;
  private void regle77() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_5 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_77(x_3, x_5);
    x_2.analyser(LEX_MCS.token_virg);
    x_3.analyser() ;
if  (att_eval)      action_htype_77(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_paraset_77(x_3, x_5);
  }
  private void regle76() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_paraset_76();
  }
private void action_auto_inh_77(S_E_MCS x_3, S_ESX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ESX -> virg E #htype ESX1 #paraset ;"});
}
  }
private void action_paraset_76() throws Exception {
try {
// locales
// instructions
this.att_paraset=this.att_hparaset;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#paraset","ESX -> #paraset ;"});
}
  }
private void action_paraset_77(S_E_MCS x_3, S_ESX_MCS x_5) throws Exception {
try {
// instructions
this.att_paraset=x_5.att_paraset;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#paraset","ESX -> virg E #htype ESX1 #paraset ;"});
}
  }
private void action_htype_77(S_E_MCS x_3, S_ESX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_paraset.add(x_3.att_type);
x_5.att_hparaset=x_3.att_paraset;
x_5.att_hcode=this.att_hcode+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","ESX -> virg E #htype ESX1 #paraset ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 10833
        regle76 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle77 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
