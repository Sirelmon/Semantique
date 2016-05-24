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
public class S_BLOC_MCS {
LEX_MCS scanner;
  S_BLOC_MCS() {
    }
  S_BLOC_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  INFOFONC att_infofon;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  int att_dep;
  TDS glob_24_t;
  private void regle24() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_INSTS_MCS x_4 = new S_INSTS_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_24(x_4);
    x_2.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_tds_24(x_4);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_gen_24(x_4);
  }
private void action_gen_24(S_INSTS_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
this.att_dep=x_4.att_dep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
private void action_auto_inh_24(S_INSTS_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_infofon=this.att_infofon;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
private void action_tds_24(S_INSTS_MCS x_4) throws Exception {
try {
// instructions
glob_24_t= new TDS(this.att_tds);
x_4.att_tds=glob_24_t;
x_4.att_hdep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","BLOC -> aco #tds INSTS acf #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle24 () ;
  }
  }
