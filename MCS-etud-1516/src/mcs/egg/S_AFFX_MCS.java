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
public class S_AFFX_MCS {
LEX_MCS scanner;
  S_AFFX_MCS() {
    }
  S_AFFX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle36() throws Exception {

    //declaration
    //appel
  }
  private void regle35() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_A_MCS x_3 = new S_A_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_35(x_3);
    x_2.analyser(LEX_MCS.token_affect);
    x_3.analyser() ;
  }
private void action_auto_inh_35(S_A_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AFFX -> affect A ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_affect : // 629
        regle35 () ;
      break ;
      case LEX_MCS.token_pv : // 628
        regle36 () ;
      break ;
      case LEX_MCS.token_virg : // 626
        regle36 () ;
      break ;
      case LEX_MCS.token_parf : // 623
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
