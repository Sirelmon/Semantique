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
public class S_TX_MCS {
LEX_MCS scanner;
  S_TX_MCS() {
    }
  S_TX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle54() throws Exception {

    //declaration
    //appel
  }
  private void regle53() throws Exception {

    //declaration
    S_OPMUL_MCS x_2 = new S_OPMUL_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_4 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_53(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","TX -> OPMUL F TX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 502
        regle53 () ;
      break ;
      case LEX_MCS.token_div : // 503
        regle53 () ;
      break ;
      case LEX_MCS.token_mod : // 504
        regle53 () ;
      break ;
      case LEX_MCS.token_et : // 505
        regle53 () ;
      break ;
      case LEX_MCS.token_plus : // 499
        regle54 () ;
      break ;
      case LEX_MCS.token_moins : // 500
        regle54 () ;
      break ;
      case LEX_MCS.token_ou : // 501
        regle54 () ;
      break ;
      case LEX_MCS.token_inf : // 493
        regle54 () ;
      break ;
      case LEX_MCS.token_sup : // 495
        regle54 () ;
      break ;
      case LEX_MCS.token_infeg : // 494
        regle54 () ;
      break ;
      case LEX_MCS.token_supeg : // 496
        regle54 () ;
      break ;
      case LEX_MCS.token_eg : // 497
        regle54 () ;
      break ;
      case LEX_MCS.token_neg : // 498
        regle54 () ;
      break ;
      case LEX_MCS.token_affect : // 481
        regle54 () ;
      break ;
      case LEX_MCS.token_virg : // 478
        regle54 () ;
      break ;
      case LEX_MCS.token_pv : // 480
        regle54 () ;
      break ;
      case LEX_MCS.token_parf : // 475
        regle54 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
