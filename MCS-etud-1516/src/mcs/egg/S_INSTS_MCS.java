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
public class S_INSTS_MCS {
LEX_MCS scanner;
  S_INSTS_MCS() {
    }
  S_INSTS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle26() throws Exception {

    //declaration
    S_INST_MCS x_2 = new S_INST_MCS(scanner,att_eval) ;
    S_INSTS_MCS x_3 = new S_INSTS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_26(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle25() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_26(S_INST_MCS x_2, S_INSTS_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INSTS -> INST INSTS1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 625
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 632
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 634
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 635
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 659
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 636
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 655
        regle26 () ;
      break ;
      case LEX_MCS.token_chaine : // 657
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 656
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 647
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 648
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 654
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 640
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 622
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 650
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 658
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 624
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 630
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 638
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 633
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
