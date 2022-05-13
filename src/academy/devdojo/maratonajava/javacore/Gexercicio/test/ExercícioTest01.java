package academy.devdojo.maratonajava.javacore.Gexercicio.test;

import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Seminario;


import java.util.Scanner;

public class ExercícioTest01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Local local = new Local("Anfiteatro 13 de maio");
        Local local1 = new Local("Praça do Colégio");
        Aluno aluno = new Aluno("",0);
        Aluno[] alunosParaSeminario ={aluno};
        Professor professor = new Professor("","");
        Seminario seminario = new Seminario("Como melhorar seu código?",local, alunosParaSeminario);
        Seminario seminario1 = new Seminario("Aprendendo JAVA sozinho, tips & tricks",local1, alunosParaSeminario);
        Seminario[] seminarioDisponiveis =  {seminario,seminario1};

        System.out.println("Seminários da Facul");
        System.out.println("Digite:  (1)Sou Aluno (2)Sou Professor");
        int resposta = input.nextInt();
        do{
            if(resposta == 1){
                System.out.println("---------------");
                System.out.println("Olá Aluno(a), queremos saber mais sobre você. Qual o seu nome?");
                String nomeAluno = input.nextLine();
                aluno.setNome(nomeAluno);
                System.out.println(nomeAluno);
                System.out.println("---------------");
                System.out.println("Qual a sua idade?");
                int idadeAluno = input.nextInt();
                aluno.setIdade(idadeAluno);
                System.out.println("---------------");
                System.out.println("## Seminários Cadastrados ##");
                System.out.println("- "+seminario.getTitulo()+" | Local: "+seminario.getLocal().getEndereco());
                System.out.println("- "+seminario1.getTitulo()+" | Local: "+seminario1.getLocal().getEndereco());

                System.out.println("Selcione seminário 1 ou 2?");
                int selSemin = input.nextInt();

                resposta=5;
            }else if (resposta == 2){

            }else{
                System.out.println("Digite:  (1)Sou Aluno (2)Sou Professor");
                resposta = input.nextInt();
            }
        }while(resposta==1 || resposta ==2);

    }

}
