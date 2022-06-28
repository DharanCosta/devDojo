package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.test;



import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.domain.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.services.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();
        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email:");
            if(email==null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
