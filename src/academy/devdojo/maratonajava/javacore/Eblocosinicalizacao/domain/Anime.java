package academy.devdojo.maratonajava.javacore.Eblocosinicalizacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1º Alocado espaço em memória para o objeto
    //2º Cada Atributo de classe é criado e inicializado com valores default ou o que for passado
    //3º Bloco de inicialização é executado
    //4º Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i =0; i< episodios.length;i++){
            episodios[i]=i+1;
        }
    }

    public Anime(){


        System.out.println(episodios);
        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
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

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
