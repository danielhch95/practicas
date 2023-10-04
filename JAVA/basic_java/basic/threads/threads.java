class Apache implements Runnable{
    public void run(){
        for (int doc=0; doc < 10; doc++){
            System.out.println("Document "+doc+" printed from thread "+Thread.currentThread().getId());
        }
    }
}

public class threads implements Runnable {

    public void run(){
    }
    public static void main(String[] args) {

        System.out.println(" ------------ Comienza el programa ------------");

        Thread hilo_1 = new Thread(new Apache());
        Thread hilo_2 = new Thread(new Apache());
        Thread hilo_3 = new Thread(new Apache());
        Thread hilo_4 = new Thread(new Apache());
        Thread hilo_5 = new Thread(new Apache()); 

        hilo_1.start();
        hilo_2.start();
        hilo_3.start();
        hilo_4.start();
        hilo_5.start();

        System.out.println("Continuamos con el programa bro");

        for (int doc=1; doc < 25; doc++) {
            System.out.println("Documento "+doc+" impreso desde main");
        }
        try {
            hilo_1.join();
            hilo_2.join();
            hilo_3.join();
            hilo_4.join();
            hilo_5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Programa terminado");       
    }
}