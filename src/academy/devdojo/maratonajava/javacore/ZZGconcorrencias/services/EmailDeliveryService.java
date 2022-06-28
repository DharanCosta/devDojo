package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.services;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.domain.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" começando a enviar emails...");
        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName+" enviando email para "+email);
                Thread.sleep(2000);
                System.out.println(threadName+" enviou email com sucesso para "+email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
