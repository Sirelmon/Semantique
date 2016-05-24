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
public class S_T_MCS {
LEX_MCS scanner;
  S_T_MCS() {
    }
  S_T_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle52() throws Exception {

    //declaration
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_5 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_52(x_3, x_5);
if  (att_eval)      action_info_52(x_3, x_5);
    x_3.analyser() ;
if  (att_eval)      action_hcode_52(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_code_52(x_3, x_5);
  }
private void action_auto_inh_52(S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","T -> #info F #hcode TX #code ;"});
}
  }
private void action_info_52(S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_info=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#info","T -> #info F #hcode TX #code ;"});
}
  }
private void action_hcode_52(S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// locales
// instructions
x_5.att_htype=x_3.att_type;
x_5.att_hcode=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hcode","T -> #info F #hcode TX #code ;"});
}
  }
private void action_code_52(S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// locales
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","T -> #info F #hcode TX #code ;"});
}
  }
  public void analyser () throws Exception {
    regle52 () ;
  }
  }
