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
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle2() throws Exception {

    //declaration
    S_ENTITE_MCS x_2 = new S_ENTITE_MCS(scanner,att_eval) ;
    S_ENTITES_MCS x_3 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle1() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITES -> ENTITE ENTITES1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.EOF :
        regle1 () ;
      break ;
      case LEX_MCS.token_typedef : // 637
        regle2 () ;
      break ;
      case LEX_MCS.token_void : // 632
        regle2 () ;
      break ;
      case LEX_MCS.token_int : // 634
        regle2 () ;
      break ;
      case LEX_MCS.token_char : // 635
        regle2 () ;
      break ;
      case LEX_MCS.token_identc : // 659
        regle2 () ;
      break ;
      case LEX_MCS.token_struct : // 636
        regle2 () ;
      break ;
      case LEX_MCS.token_asm : // 633
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
