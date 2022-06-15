package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Ynuyasha";

    void print(){
        // classes locais, dentro de método ou bloco de inicialização
        // Modificadores de acesso, abstract ou final
        //Nas classes locais não pode trocar o valor pois eles já são implicitamente finais.
        final String lastName = "da Silva";

        class LocalClass{
            public void printLocal(){
                System.out.println(name+" "+lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }


    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
