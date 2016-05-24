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
public class S_PARFS_MCS {
LEX_MCS scanner;
  S_PARFS_MCS() {
    }
  S_PARFS_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle8() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_8();
  }
  private void regle9() throws Exception {

    //declaration
    S_PARF_MCS x_2 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_3 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_GEN_9(x_2, x_3);
  }
private void action_gen_8() throws Exception {
try {
// locales
// instructions
this.att_para= new LinkedHashMap();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","PARFS -> #gen ;"});
}
  }
private void action_auto_inh_9(S_PARF_MCS x_2, S_PARFSX_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFS -> PARF PARFSX #GEN ;"});
}
  }
private void action_GEN_9(S_PARF_MCS x_2, S_PARFSX_MCS x_3) throws Exception {
try {
// locales
LinkedHashMap loc_m;
// instructions
loc_m= new LinkedHashMap();
loc_m.putAll(x_2.att_para);
loc_m.putAll(x_3.att_para);
this.att_para=loc_m;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#GEN","PARFS -> PARF PARFSX #GEN ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 10833
        regle8 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle9 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle9 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle9 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle9 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
