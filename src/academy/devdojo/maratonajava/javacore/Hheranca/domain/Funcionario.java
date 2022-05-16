package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{

    private double salario;
    static{
        System.out.println("Dentro do bloco de inicialização estático funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi um salário de "+this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
