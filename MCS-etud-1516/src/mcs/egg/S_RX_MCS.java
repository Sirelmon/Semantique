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
public class S_RX_MCS {
LEX_MCS scanner;
  S_RX_MCS() {
    }
  S_RX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle48() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_48();
  }
  private void regle47() throws Exception {

    //declaration
    S_OPADD_MCS x_2 = new S_OPADD_MCS(scanner,att_eval) ;
    S_T_MCS x_3 = new S_T_MCS(scanner,att_eval) ;
    S_RX_MCS x_5 = new S_RX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_47(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_htype_47(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_47(x_2, x_3, x_5);
  }
private void action_htype_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_5) throws Exception {
try {
// instructions
if ((x_3.att_type.getType()!=this.att_htype.getType()||!(this.att_htype.OpComp(x_2.att_op)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_08, MCSMessages.B_08,new Object[]{""+x_3.att_type});

}
else {
x_5.att_htype=this.att_htype;
x_5.att_hcode=this.att_hcode+x_3.att_code+this.att_machine.genSubr(x_2.att_op, x_3.att_type);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","RX -> OPADD T #htype RX1 #type ;"});
}
  }
private void action_auto_inh_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","RX -> OPADD T #htype RX1 #type ;"});
}
  }
private void action_type_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","RX -> OPADD T #htype RX1 #type ;"});
}
  }
private void action_type_48() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","RX -> #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_plus : // 10857
        regle47 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle47 () ;
      break ;
      case LEX_MCS.token_ou : // 10859
        regle47 () ;
      break ;
      case LEX_MCS.token_inf : // 10851
        regle48 () ;
      break ;
      case LEX_MCS.token_sup : // 10853
        regle48 () ;
      break ;
      case LEX_MCS.token_infeg : // 10852
        regle48 () ;
      break ;
      case LEX_MCS.token_supeg : // 10854
        regle48 () ;
      break ;
      case LEX_MCS.token_eg : // 10855
        regle48 () ;
      break ;
      case LEX_MCS.token_neg : // 10856
        regle48 () ;
      break ;
      case LEX_MCS.token_affect : // 10839
        regle48 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle48 () ;
      break ;
      case LEX_MCS.token_pv : // 10838
        regle48 () ;
      break ;
      case LEX_MCS.token_parf : // 10833
        regle48 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
