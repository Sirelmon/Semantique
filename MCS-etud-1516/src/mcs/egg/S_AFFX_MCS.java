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
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  String att_hcode;
  private void regle36() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_36();
  }
  private void regle35() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_A_MCS x_3 = new S_A_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_35(x_3);
    x_2.analyser(LEX_MCS.token_affect);
    x_3.analyser() ;
if  (att_eval)      action_type_35(x_3);
  }
private void action_type_35(S_A_MCS x_3) throws Exception {
try {
// locales
// instructions
this.att_type=x_3.att_type;
this.att_code=x_3.att_code+this.att_hcode+this.att_machine.genWriteIndirectMem(x_3.att_type.getTaille());
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> affect A #type ;"});
}
  }
private void action_auto_inh_35(S_A_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AFFX -> affect A #type ;"});
}
  }
private void action_type_36() throws Exception {
try {
// locales
// instructions
this.att_type=this.att_htype;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_affect : // 10839
        regle35 () ;
      break ;
      case LEX_MCS.token_pv : // 10838
        regle36 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle36 () ;
      break ;
      case LEX_MCS.token_parf : // 10833
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
