package academy.devdojo.maratonajava.javacore.ZZFTthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }
    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }
    public void addMembers(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" checkando se existem emails");
        synchronized (this.emails){
            while(this.emails.size()==0){
                if(!open ) break;
                System.out.println(Thread.currentThread().getName()+" Não tem email disponível na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName()+
                    " Notificando todos que não estamos pegando mais emails");
        }
    }

}
