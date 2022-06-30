package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

public class Person {
    private String firsName;
    private String lastName;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private Person(String firsName, String lastName, String username, String email) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public static class PersonBuilder{
        private String firsName;
        private String lastName;
        private String username;
        private String email;


        public PersonBuilder firstName(String firsName){
            this.firsName = firsName;
            return this;
        }
        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }
        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }
        public Person build(){
            return new Person(firsName,lastName,username,email);
        }

    }

}
