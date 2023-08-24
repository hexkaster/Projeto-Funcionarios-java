public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        FuncionarioBasico f2 = new FuncionarioBasico();
        FuncionarioMedio f3 = new FuncionarioMedio();
        FuncionarioGrad f4 = new FuncionarioGrad();

        System.out.println("Salário base:" + " " + f1.rendabasica);
        System.out.println("Salário Funcionário Apenas Com Ensino Básico:" + " " + f2.rendatotalEB);
        System.out.println("Salário Funcionário Com Ensino Médio:" + " " + f3.rendatotalEM);
        System.out.println("Salário Funcionário Graduado:" + " " + f4.rendatotalgrad);
}
}