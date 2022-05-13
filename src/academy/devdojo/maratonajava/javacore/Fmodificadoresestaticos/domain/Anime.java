package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0º Bloco de inicialização é executado quando a JVM carregar
    //1º Alocado espaço em memória para o objeto
    //2º Cada Atributo de classe é criado e inicializado com valores default ou o que for passado
    //3º Bloco de inicialização é executado
    //4º Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estático 01");
        episodios = new int[100];
        for(int i =0; i< episodios.length;i++){
            episodios[i]=i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 02");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 03");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    public Anime(){
        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
