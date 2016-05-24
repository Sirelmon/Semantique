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
public class S_CHAMPS_MCS {
LEX_MCS scanner;
  S_CHAMPS_MCS() {
    }
  S_CHAMPS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LCHAMPS att_champs;
  int att_hdep;
  LEX_MCS att_scanner;
  private void regle22() throws Exception {

    //declaration
    S_CHAMP_MCS x_2 = new S_CHAMP_MCS(scanner,att_eval) ;
    S_CHAMPS_MCS x_4 = new S_CHAMPS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_ch_22(x_2, x_4);
    x_4.analyser() ;
  }
  private void regle21() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_4) throws Exception {
try {
// instructions
x_2.att_champs=this.att_champs;
x_4.att_champs=this.att_champs;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","CHAMPS -> CHAMP #ch CHAMPS1 ;"});
}
  }
private void action_ch_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_4) throws Exception {
try {
// locales
CHAMP loc_c;
// instructions
loc_c=this.att_champs.chercher(x_2.att_hnom);
if (loc_c!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_00, MCSMessages.B_00,new Object[]{""+x_2.att_hnom});

}
else {
loc_c= new CHAMP(x_2.att_hnom, x_2.att_type, this.att_hdep);
    this.att_champs.inserer(loc_c);
x_4.att_hdep=this.att_hdep+x_2.att_type.getTaille();
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ch","CHAMPS -> CHAMP #ch CHAMPS1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 10835
        regle21 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle22 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle22 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle22 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle22 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }