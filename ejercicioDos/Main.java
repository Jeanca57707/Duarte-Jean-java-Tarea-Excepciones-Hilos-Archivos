public class Main{

    public static void main(String[] args){

        Corredores corredor1 = new Corredores("Juan");
        Corredores corredor2 = new Corredores("Anna");
        Corredores corredor3 = new Corredores("Pablo");
        Corredores corredor4 = new Corredores("Jeison");

        Contador contador = new Contador();

        System.out.println("\n======CARRERA DE 10 METROS======\n");
        System.out.println("Los corredores que se enfrentan son: " + corredor1.getCorredor()
        + ", " + corredor2.getCorredor() + ", " + corredor3.getCorredor() + " y " + corredor4.getCorredor());

        System.out.println("\nEstado inicial de " + corredor1.getCorredor() +": " + corredor1.getState());
        System.out.println("Estado inicial de " + corredor2.getCorredor() +": " + corredor2.getState());
        System.out.println("Estado inicial de " + corredor3.getCorredor() +": " + corredor3.getState());    
        System.out.println("Estado inicial de " + corredor4.getCorredor() +": " + corredor4.getState() + "\n");

        try{

            contador.start();
            contador.join();

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }

        System.out.println("\nLA CARRERA HA COMENZADO!!!\n");

        try{
            
           corredor1.start();
           corredor2.start();
           corredor3.start();
           corredor4.start();

           corredor1.join();
           corredor2.join();
           corredor3.join();
           corredor4.join();


           System.out.println("\nEstado final de " + corredor1.getCorredor() +": " + corredor1.getState());
           System.out.println("Estado final de " + corredor2.getCorredor() +": " + corredor2.getState());
           System.out.println("Estado final de " + corredor3.getCorredor() +": " + corredor3.getState());    
           System.out.println("Estado final de " + corredor4.getCorredor() +": " + corredor4.getState());

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }
    }
}