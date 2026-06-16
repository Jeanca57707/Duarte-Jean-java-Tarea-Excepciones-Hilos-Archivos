public class Contador extends Thread{

    @Override

    public void run(){

        int num = 3;

        System.out.println("La carrera comienza en...");

        try{
            
            while( num > 0){

                System.out.println(num);
                Thread.sleep(1000);
                num --;  
            }

            System.out.println("¡YA!");

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }

    }
}
           
        
    
     
    

