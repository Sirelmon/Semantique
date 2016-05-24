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
public class S_OPREL_MCS {
LEX_MCS scanner;
  S_OPREL_MCS() {
    }
  S_OPREL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_op;
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle40() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_inf);
if  (att_eval)      action_a_40();
  }
  private void regle41() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_sup);
if  (att_eval)      action_a_41();
  }
  private void regle42() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_infeg);
if  (att_eval)      action_a_42();
  }
  private void regle43() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_supeg);
if  (att_eval)      action_a_43();
  }
  private void regle44() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_eg);
if  (att_eval)      action_a_44();
  }
  private void regle45() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_neg);
if  (att_eval)      action_a_45();
  }
private void action_a_43() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(3);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> supeg #a ;"});
}
  }
private void action_a_42() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(2);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> infeg #a ;"});
}
  }
private void action_a_45() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(5);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> neg #a ;"});
}
  }
private void action_a_44() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(4);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> eg #a ;"});
}
  }
private void action_a_41() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(1);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> sup #a ;"});
}
  }
private void action_a_40() throws Exception {
try {
// locales
OPERATEUR loc_o;
// instructions
loc_o= new OPERATEUR();
this.att_op=loc_o.op(0);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","OPREL -> inf #a ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 10851
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 10853
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 10852
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 10854
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 10855
        regle44 () ;
      break ;
      case LEX_MCS.token_neg : // 10856
        regle45 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
