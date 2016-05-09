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
public class S_PTRS_MCS {
LEX_MCS scanner;
  S_PTRS_MCS() {
    }
  S_PTRS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle15() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PTRS_MCS x_3 = new S_PTRS_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
  }
  private void regle14() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_identc : // 659
        regle14 () ;
      break ;
      case LEX_MCS.token_ident : // 658
        regle14 () ;
      break ;
      case LEX_MCS.token_parf : // 623
        regle14 () ;
      break ;
      case LEX_MCS.token_mult : // 650
        regle15 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
