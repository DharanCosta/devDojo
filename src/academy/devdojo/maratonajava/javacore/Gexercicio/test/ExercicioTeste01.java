package academy.devdojo.maratonajava.javacore.Gexercicio.test;

import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Seminario;

public class ExercicioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua da Gloria");
        Aluno aluno = new Aluno("Carlos",25);
        Aluno[] alunosParaSeminario ={aluno};
        Professor professor = new Professor("José Emanuel", "DevDojo Java");
        Seminario seminario = new Seminario("Como aprender JAVA?", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis = {seminario};


        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


   }
}
