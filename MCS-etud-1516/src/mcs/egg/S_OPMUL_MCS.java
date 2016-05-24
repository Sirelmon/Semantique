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
public class S_OPMUL_MCS {
LEX_MCS scanner;
  S_OPMUL_MCS() {
    }
  S_OPMUL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_op;
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle56() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_div);
if  (att_eval)      action_a_56();
  }
  private void regle57() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mod);
if  (att_eval)      action_a_57();
  }
  private void regle58() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_et);
if  (att_eval)      action_a_58();
  }
  private void regle55() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
if  (att_eval)      action_a_55();
  }
private void action_a_56() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(10);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPMUL -> div #a ;"});
}
  }
private void action_a_55() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(9);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPMUL -> mult #a ;"});
}
  }
private void action_a_58() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(12);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPMUL -> et #a ;"});
}
  }
private void action_a_57() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(11);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPMUL -> mod #a ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 10860
        regle55 () ;
      break ;
      case LEX_MCS.token_div : // 10861
        regle56 () ;
      break ;
      case LEX_MCS.token_mod : // 10862
        regle57 () ;
      break ;
      case LEX_MCS.token_et : // 10863
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
