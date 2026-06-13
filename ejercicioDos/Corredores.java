import java.util.*;

public class Corredores extends Thread{

    private String corredor;

    public Corredores(String corredor){

        setCorredor(corredor);
    }
    public void setCorredor(String corredor){

        this.corredor = corredor;
    }
    public String getCorredor(){

        return corredor;
    }

    @Override

    public void run(){

        Random random = new Random();
        int num ;
        boolean enMeta = false;
        int contador = 0;
        
        try{

            do{
                Thread.sleep(1000);
                num = random.nextInt(1,11);

                if(num == 5){

                    contador ++;
                    System.out.println(getCorredor() + " avanzó un metro " + contador);
                }
                if (contador == 10){

                    enMeta = true;
                    System.out.println(getCorredor() + "llegó a la meta.");
                    return;
                }

            }while(!enMeta);

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }
    }
}