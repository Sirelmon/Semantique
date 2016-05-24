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
public class S_OPADD_MCS {
LEX_MCS scanner;
  S_OPADD_MCS() {
    }
  S_OPADD_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_op;
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle49() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_plus);
if  (att_eval)      action_a_49();
  }
  private void regle50() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_moins);
if  (att_eval)      action_a_50();
  }
  private void regle51() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_ou);
if  (att_eval)      action_a_51();
  }
private void action_a_50() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(7);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPADD -> moins #a ;"});
}
  }
private void action_a_51() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(8);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPADD -> ou #a ;"});
}
  }
private void action_a_49() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(6);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPADD -> plus #a ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_plus : // 10857
        regle49 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle50 () ;
      break ;
      case LEX_MCS.token_ou : // 10859
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
