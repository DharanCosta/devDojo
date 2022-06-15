package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

//Classes que são utilizadas em algum ponto do código e não podem ser reutilizadas
class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}
//class Cachorro extends Animal{
//    @Override
//    public void walk() {
//        System.out.println("Cachorro walking");
//    }
//}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
    Animal animal = new Animal(){
        @Override
        public void walk() {
            System.out.println("Walking in the shadow");
        }


    };
    animal.walk();
    }
}
