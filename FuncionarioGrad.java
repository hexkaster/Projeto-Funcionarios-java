public class FuncionarioGrad extends FuncionarioMedio {
    String universidade;
    int rendatotalgrad = rendatotalEM + (rendatotalEM * 100/100);


    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
}

}
