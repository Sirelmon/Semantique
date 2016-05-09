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
public class S_ES_MCS {
LEX_MCS scanner;
  S_ES_MCS() {
    }
  S_ES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle75() throws Exception {

    //declaration
    //appel
  }
  private void regle76() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_3 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_76(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_76(S_E_MCS x_2, S_ESX_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> E ESX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 475
        regle75 () ;
      break ;
      case LEX_MCS.token_entier : // 507
        regle76 () ;
      break ;
      case LEX_MCS.token_chaine : // 509
        regle76 () ;
      break ;
      case LEX_MCS.token_caractere : // 508
        regle76 () ;
      break ;
      case LEX_MCS.token_plus : // 499
        regle76 () ;
      break ;
      case LEX_MCS.token_moins : // 500
        regle76 () ;
      break ;
      case LEX_MCS.token_non : // 506
        regle76 () ;
      break ;
      case LEX_MCS.token_null : // 492
        regle76 () ;
      break ;
      case LEX_MCS.token_paro : // 474
        regle76 () ;
      break ;
      case LEX_MCS.token_mult : // 502
        regle76 () ;
      break ;
      case LEX_MCS.token_ident : // 510
        regle76 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
