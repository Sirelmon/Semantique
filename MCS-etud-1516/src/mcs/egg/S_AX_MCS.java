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
public class S_AX_MCS {
LEX_MCS scanner;
  S_AX_MCS() {
    }
  S_AX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle38() throws Exception {

    //declaration
    S_OPREL_MCS x_2 = new S_OPREL_MCS(scanner,att_eval) ;
    S_R_MCS x_3 = new S_R_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_38(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle39() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_38(S_OPREL_MCS x_2, S_R_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AX -> OPREL R ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 641
        regle38 () ;
      break ;
      case LEX_MCS.token_sup : // 643
        regle38 () ;
      break ;
      case LEX_MCS.token_infeg : // 642
        regle38 () ;
      break ;
      case LEX_MCS.token_supeg : // 644
        regle38 () ;
      break ;
      case LEX_MCS.token_eg : // 645
        regle38 () ;
      break ;
      case LEX_MCS.token_neg : // 646
        regle38 () ;
      break ;
      case LEX_MCS.token_affect : // 629
        regle39 () ;
      break ;
      case LEX_MCS.token_virg : // 626
        regle39 () ;
      break ;
      case LEX_MCS.token_pv : // 628
        regle39 () ;
      break ;
      case LEX_MCS.token_parf : // 623
        regle39 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
