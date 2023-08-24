public class FuncionarioMedio extends FuncionarioBasico {
    int rendatotalEM = rendatotalEB + (rendatotalEB * 50/100);

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
