public class FuncionarioBasico extends Funcionario {
    String escola;
    int rendatotalEB = rendabasica + (rendabasica * 10/100);
    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    
  //  public void setRenda10(int renda10) {
   //     this.renda10 = renda + (renda * percentual10);
   // }
}