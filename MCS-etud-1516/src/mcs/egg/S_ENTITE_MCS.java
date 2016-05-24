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
public class S_ENTITE_MCS {
LEX_MCS scanner;
  S_ENTITE_MCS() {
    }
  S_ENTITE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  int att_dep;
  private void regle3() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_3, x_4);
    x_2.analyser(LEX_MCS.token_typedef);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_type_3(x_3, x_4);
  }
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_5 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_decl_4(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_code_4(x_2, x_3, x_5);
  }
private void action_type_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_4.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_00, MCSMessages.B_00,new Object[]{""+x_4.att_txt});

}
else {
loc_i= new INFOTYPE(x_3.att_type);
    this.att_tds.inserer(x_4.att_txt, loc_i);
this.att_dep=this.att_hdep;
this.att_code="";
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","ENTITE -> typedef TYPE identc pv #type ;"});
}
  }
private void action_auto_inh_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> TYPE ident #decl DECL #code ;"});
}
  }
private void action_code_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// locales
INFOVAR loc_iv;
// instructions
if (!(x_5.att_est_fonction)){
loc_iv= new INFOVAR(x_2.att_type, this.att_hdep);
this.att_dep=this.att_hdep+1;
this.att_code=this.att_machine.genDecl(x_3.att_txt, loc_iv, this.att_machine.genPush(loc_iv));
}
else {
this.att_code=x_5.att_code;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","ENTITE -> TYPE ident #decl DECL #code ;"});
}
  }
private void action_auto_inh_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> typedef TYPE identc pv #type ;"});
}
  }
private void action_decl_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_nom=x_3.att_txt;
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#decl","ENTITE -> TYPE ident #decl DECL #code ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 10847
        regle3 () ;
      break ;
      case LEX_MCS.token_void : // 10842
        regle4 () ;
      break ;
      case LEX_MCS.token_int : // 10844
        regle4 () ;
      break ;
      case LEX_MCS.token_char : // 10845
        regle4 () ;
      break ;
      case LEX_MCS.token_identc : // 10869
        regle4 () ;
      break ;
      case LEX_MCS.token_struct : // 10846
        regle4 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
