package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.test;

import java.util.concurrent.*;

public class LinkedTrasnferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//       ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Willian"));
        System.out.println(tq.offer("Lucas"));
        System.out.println(tq.offer("Pabllo", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if(tq.hasWaitingConsumer()){

            tq.transfer("Devdojo");
        }
        System.out.println(tq.tryTransfer("Academy",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
//        System.out.println(tq.pool());
//        System.out.println(tq.remove());
//        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
