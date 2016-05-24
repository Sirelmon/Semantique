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
public class S_F_MCS {
LEX_MCS scanner;
  S_F_MCS() {
    }
  S_F_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  INFO att_info;
  private void regle61() throws Exception {

    //declaration
    S_OPUN_MCS x_2 = new S_OPUN_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_61(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_type_61(x_2, x_3);
  }
  private void regle60() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_caractere);
if  (att_eval)      action_type_60(x_2);
  }
  private void regle65() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null);
if  (att_eval)      action_type_65();
  }
  private void regle67() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_F_MCS x_5 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_67(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_type_67(x_3, x_5);
  }
  private void regle66() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_66(x_3, x_6);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htype_66(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_66(x_3, x_6);
  }
  private void regle69() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_2, x_4);
    x_2.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_69(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_69(x_2, x_4);
  }
  private void regle68() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_68(x_3);
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
if  (att_eval)      action_type_68(x_3);
  }
  private void regle59() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_entier);
if  (att_eval)      action_type_59(x_2);
  }
private void action_type_67(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
this.att_code=x_5.att_code;
this.att_code_est_adresse=x_5.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro TYPE parf F1 #type ;"});
}
  }
private void action_type_68(S_F_MCS x_3) throws Exception {
try {
// locales
DTYPE loc_t;
DTYPE loc_tp;
// instructions
loc_t=x_3.att_type;
if (loc_t instanceof POINTEUR ){
loc_tp=((POINTEUR)loc_t).getTypeP();
if (loc_tp instanceof POINTEUR ){
this.att_code_est_adresse=true;
}
else {
this.att_code_est_adresse=false;

}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_3245674, MCSMessages.B_3245674,new Object[]{""+x_3.att_type.toString()});


}
this.att_type=x_3.att_type;
this.att_code=x_3.att_code+this.att_machine.genReadIndirectMem(x_3.att_type.getTaille());
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> mult F1 #type ;"});
}
  }
private void action_htype_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
INFOFONC loc_i_f;
DTYPE loc_t;
Emplacement loc_e;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_01, MCSMessages.B_01,new Object[]{""+x_2.att_txt});

}
else {
x_4.att_info=loc_i;
x_4.att_htype=loc_i.getType();
if (loc_i instanceof INFOVAR ){
loc_iv=((INFOVAR)loc_i);
loc_e=loc_iv.getEmpl();
loc_t=loc_iv.getType();
if (loc_t instanceof STRUCT ){
x_4.att_hcode=this.att_machine.genAdr(loc_e.getDep());
x_4.att_hcode_est_adresse=false;
}
else {
if (loc_t instanceof POINTEUR ){
x_4.att_hcode=this.att_machine.genReadMem(loc_e.getDep());
x_4.att_hcode_est_adresse=true;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_0546125, MCSMessages.B_0546125,new Object[]{""+x_2.att_txt});


}

}
}
else {
if (loc_i instanceof INFOFONC ){
loc_i_f=((INFOFONC)loc_i);
x_4.att_hcode=this.att_machine.genCall(loc_i_f.getEtiq());
x_4.att_hcode_est_adresse=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_02145, MCSMessages.B_02145,new Object[]{""+x_2.att_txt});


}

}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> ident #htype FX #type ;"});
}
  }
private void action_type_65() throws Exception {
try {
// instructions
this.att_type= new POINTEUR(null);
this.att_code=this.att_machine.genNull();
this.att_code_est_adresse=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> null #type ;"});
}
  }
private void action_type_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
this.att_code=x_6.att_code;
this.att_code_est_adresse=x_6.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro E parf #htype FX #type ;"});
}
  }
private void action_type_61(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
if (!(x_3.att_type.OpComp(x_2.att_op))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_08, MCSMessages.B_08,new Object[]{""+x_3.att_type});

}
else {
this.att_type=x_3.att_type;
this.att_code=x_3.att_code+this.att_machine.genSubr(x_2.att_op, x_3.att_type);
this.att_code_est_adresse=x_3.att_code_est_adresse;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> OPUN F1 #type ;"});
}
  }
private void action_type_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
this.att_code=x_4.att_code;
this.att_code_est_adresse=x_4.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> ident #htype FX #type ;"});
}
  }
private void action_type_59(T_MCS x_2) throws Exception {
try {
// instructions
this.att_type= new DTYPE("int", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> entier #type ;"});
}
  }
private void action_auto_inh_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_6.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro E parf #htype FX #type ;"});
}
  }
private void action_auto_inh_67(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro TYPE parf F1 #type ;"});
}
  }
private void action_auto_inh_68(S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_3.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> mult F1 #type ;"});
}
  }
private void action_auto_inh_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> ident #htype FX #type ;"});
}
  }
private void action_type_60(T_MCS x_2) throws Exception {
try {
// instructions
this.att_type= new DTYPE("char", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> caractere #type ;"});
}
  }
private void action_htype_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// locales
// instructions
x_6.att_htype=x_3.att_type;
x_6.att_hcode=x_3.att_code;
x_6.att_hcode_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> paro E parf #htype FX #type ;"});
}
  }
private void action_auto_inh_61(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_3.att_info=this.att_info;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> OPUN F1 #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 10865
        regle59 () ;
      break ;
      case LEX_MCS.token_caractere : // 10866
        regle60 () ;
      break ;
      case LEX_MCS.token_plus : // 10857
        regle61 () ;
      break ;
      case LEX_MCS.token_moins : // 10858
        regle61 () ;
      break ;
      case LEX_MCS.token_non : // 10864
        regle61 () ;
      break ;
      case LEX_MCS.token_null : // 10850
        regle65 () ;
      break ;
      case LEX_MCS.token_paro : // 10832
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_entier : // 10865
            regle66 () ;
          break ;
          case LEX_MCS.token_caractere : // 10866
            regle66 () ;
          break ;
          case LEX_MCS.token_plus : // 10857
            regle66 () ;
          break ;
          case LEX_MCS.token_moins : // 10858
            regle66 () ;
          break ;
          case LEX_MCS.token_non : // 10864
            regle66 () ;
          break ;
          case LEX_MCS.token_null : // 10850
            regle66 () ;
          break ;
          case LEX_MCS.token_paro : // 10832
            regle66 () ;
          break ;
          case LEX_MCS.token_mult : // 10860
            regle66 () ;
          break ;
          case LEX_MCS.token_ident : // 10868
            regle66 () ;
          break ;
          case LEX_MCS.token_void : // 10842
            regle67 () ;
          break ;
          case LEX_MCS.token_int : // 10844
            regle67 () ;
          break ;
          case LEX_MCS.token_char : // 10845
            regle67 () ;
          break ;
          case LEX_MCS.token_identc : // 10869
            regle67 () ;
          break ;
          case LEX_MCS.token_struct : // 10846
            regle67 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_paro);
        }
      break ;
      case LEX_MCS.token_mult : // 10860
        regle68 () ;
      break ;
      case LEX_MCS.token_ident : // 10868
        regle69 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }