package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class InnerClass {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        InnerClass innerClass1 = new OuterClassesTest01().new InnerClass();
        innerClass.printOuterClassAttribute();
        innerClass1.printOuterClassAttribute();
    }

}
