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
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  String att_hcode;
  private void regle54() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_54();
  }
  private void regle53() throws Exception {

    //declaration
    S_OPMUL_MCS x_2 = new S_OPMUL_MCS(scanner,att_eval) ;
    S_F_MCS x_4 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_6 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_53(x_2, x_4, x_6);
    x_2.analyser() ;
if  (att_eval)      action_info_53(x_2, x_4, x_6);
    x_4.analyser() ;
if  (att_eval)      action_htype_53(x_2, x_4, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_53(x_2, x_4, x_6);
  }
private void action_auto_inh_53(S_OPMUL_MCS x_2, S_F_MCS x_4, S_TX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","TX -> OPMUL #info F #htype TX1 #type ;"});
}
  }
private void action_type_54() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> #type ;"});
}
  }
private void action_type_53(S_OPMUL_MCS x_2, S_F_MCS x_4, S_TX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_6.att_type;
this.att_code=x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> OPMUL #info F #htype TX1 #type ;"});
}
  }
private void action_htype_53(S_OPMUL_MCS x_2, S_F_MCS x_4, S_TX_MCS x_6) throws Exception {
try {
// instructions
if ((x_4.att_type.getType()!=this.att_htype.getType()||!(this.att_htype.OpComp(x_2.att_op)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_08, MCSMessages.B_08,new Object[]{""+x_4.att_type});

}
else {
x_6.att_htype=this.att_htype;
x_6.att_hcode=this.att_hcode+x_4.att_code+this.att_machine.genSubr(x_2.att_op, x_4.att_type);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","TX -> OPMUL #info F #htype TX1 #type ;"});
}
  }
private void action_info_53(S_OPMUL_MCS x_2, S_F_MCS x_4, S_TX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_info=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#info","TX -> OPMUL #info F #htype TX1 #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 10860
        regle53 () ;
      break ;
      case LEX_MCS.token_div : // 10861
        regle53 () ;
      break ;
      case LEX_MCS.token_mod : // 10862
        regle53 () ;
      break ;
      case LEX_MCS.token_et : // 10863
        regle53 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle54 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle54 () ;
      break ;
      case LEX_MCS.token_ou : // 10859
        regle54 () ;
      break ;
      case LEX_MCS.token_inf : // 10851
        regle54 () ;
      break ;
      case LEX_MCS.token_sup : // 10853
        regle54 () ;
      break ;
      case LEX_MCS.token_infeg : // 10852
        regle54 () ;
      break ;
      case LEX_MCS.token_supeg : // 10854
        regle54 () ;
      break ;
      case LEX_MCS.token_eg : // 10855
        regle54 () ;
      break ;
      case LEX_MCS.token_neg : // 10856
        regle54 () ;
      break ;
      case LEX_MCS.token_affect : // 10839
        regle54 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle54 () ;
      break ;
      case LEX_MCS.token_pv : // 10838
        regle54 () ;
      break ;
      case LEX_MCS.token_parf : // 10833
        regle54 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
