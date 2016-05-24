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
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
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
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  String att_hcode;
  INFO att_info;
  private void regle70() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_70();
  }
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_3, x_5);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_72(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_72(x_3, x_5);
  }
  private void regle71() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_71(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_71(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_71(x_3, x_5);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_ES_MCS x_3 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_3, x_6);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htype_73(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_73(x_3, x_6);
  }
private void action_auto_inh_73(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_6.att_htype=this.att_htype;
x_6.att_hcode_est_adresse=this.att_hcode_est_adresse;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_6.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> paro ES parf #htype FX1 #type ;"});
}
  }
private void action_htype_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
STRUCT loc_s;
DTYPE loc_t;
DTYPE loc_tident;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
loc_t=this.att_info.getType();
if (loc_t instanceof STRUCT ){
loc_s=((STRUCT)loc_t);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercher(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_10, MCSMessages.B_10,new Object[]{""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
loc_tident=loc_c.getType();
if ((this.att_hcode_est_adresse)){
x_5.att_hcode=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep());
}
else {
x_5.att_hcode=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep())+this.att_machine.genReadIndirectMem(loc_tident.getTaille());
}
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_09, MCSMessages.B_09,new Object[]{""+loc_t});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_type_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
this.att_code_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident #htype FX1 #type ;"});
}
  }
private void action_type_73(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_6.att_type;
this.att_code=x_6.att_code;
this.att_code_est_adresse=x_6.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> paro ES parf #htype FX1 #type ;"});
}
  }
private void action_type_70() throws Exception {
try {
// instructions
this.att_type=this.att_info.getType();
this.att_code=this.att_hcode;
this.att_code_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> #type ;"});
}
  }
private void action_htype_73(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// locales
INFOFONC loc_iff;
// instructions
if (this.att_info instanceof INFOFONC ){
loc_iff=((INFOFONC)this.att_info);
if (!((loc_iff.mmPara(x_3.att_paraset)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_08, MCSMessages.B_08,new Object[]{""+"parametres pas eguaux"});

}

x_6.att_hcode=x_3.att_code+this.att_hcode;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_b_08, MCSMessages.b_08,new Object[]{""+"ce n'est pas une fonction"});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> paro ES parf #htype FX1 #type ;"});
}
  }
private void action_type_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
this.att_code_est_adresse=x_5.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_htype_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
POINTEUR loc_p;
DTYPE loc_t;
DTYPE loc_tp;
String loc_code;
LCHAMPS loc_lc;
STRUCT loc_s;
CHAMP loc_c;
// instructions
loc_t=this.att_info.getType();
if (loc_t instanceof POINTEUR ){
loc_p=((POINTEUR)loc_t);
x_5.att_htype=loc_p.getType();
loc_tp=loc_p.getType();
if (loc_tp instanceof STRUCT ){
loc_s=((STRUCT)loc_tp);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercher(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_10, MCSMessages.B_10,new Object[]{""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
x_5.att_hcode=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_45, MCSMessages.B_45,new Object[]{""+x_3.att_txt});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_11, MCSMessages.B_11,new Object[]{""+this.att_htype});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> arrow ident #htype FX1 #type ;"});
}
  }
private void action_auto_inh_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_hcode_est_adresse=this.att_hcode_est_adresse;
x_5.att_tds=this.att_tds;
x_5.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_auto_inh_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_hcode_est_adresse=this.att_hcode_est_adresse;
x_5.att_tds=this.att_tds;
x_5.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident #htype FX1 #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 10860
        regle70 () ;
      break ;
      case LEX_MCS.token_div : // 10861
        regle70 () ;
      break ;
      case LEX_MCS.token_mod : // 10862
        regle70 () ;
      break ;
      case LEX_MCS.token_et : // 10863
        regle70 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle70 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle70 () ;
      break ;
      case LEX_MCS.token_ou : // 10859
        regle70 () ;
      break ;
      case LEX_MCS.token_inf : // 10851
        regle70 () ;
      break ;
      case LEX_MCS.token_sup : // 10853
        regle70 () ;
      break ;
      case LEX_MCS.token_infeg : // 10852
        regle70 () ;
      break ;
      case LEX_MCS.token_supeg : // 10854
        regle70 () ;
      break ;
      case LEX_MCS.token_eg : // 10855
        regle70 () ;
      break ;
      case LEX_MCS.token_neg : // 10856
        regle70 () ;
      break ;
      case LEX_MCS.token_affect : // 10839
        regle70 () ;
      break ;
      case LEX_MCS.token_virg : // 10836
        regle70 () ;
      break ;
      case LEX_MCS.token_pv : // 10838
        regle70 () ;
      break ;
      case LEX_MCS.token_parf : // 10833
        regle70 () ;
      break ;
      case LEX_MCS.token_pt : // 10837
        regle71 () ;
      break ;
      case LEX_MCS.token_arrow : // 10849
        regle72 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        regle73 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
