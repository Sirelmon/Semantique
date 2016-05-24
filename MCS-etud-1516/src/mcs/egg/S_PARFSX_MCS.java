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
public class S_PARFSX_MCS {
LEX_MCS scanner;
  S_PARFSX_MCS() {
    }
  S_PARFSX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LinkedHashMap att_para;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle10() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_10();
  }
  private void regle11() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARF_MCS x_3 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_4 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_11(x_3, x_4);
    x_2.analyser(LEX_MCS.token_virg);
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_GEN_11(x_3, x_4);
  }
private void action_auto_inh_11(S_PARF_MCS x_3, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFSX -> virg PARF PARFSX1 #GEN ;"});
}
  }
private void action_GEN_11(S_PARF_MCS x_3, S_PARFSX_MCS x_4) throws Exception {
try {
// locales
LinkedHashMap loc_m;
// instructions
loc_m= new LinkedHashMap();
loc_m.putAll(x_3.att_para);
loc_m.putAll(x_4.att_para);
this.att_para=loc_m;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#GEN","PARFSX -> virg PARF PARFSX1 #GEN ;"});
}
  }
private void action_gen_10() throws Exception {
try {
// locales
// instructions
this.att_para= new LinkedHashMap();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","PARFSX -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 10833
        regle10 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle11 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
