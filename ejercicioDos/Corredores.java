import java.util.*;

public class Corredores extends Thread{

    private String corredor;
    private static String ganador = null;

    public Corredores(String corredor){

        setCorredor(corredor);
    }
    public void setCorredor(String corredor){

        this.corredor = corredor;
    }
    public String getCorredor(){

        return corredor;
    }

    public String ganador(){

        return ganador + " gano la carrera!!";
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
                num = random.nextInt(1,3);

                if(num == 2){

                    contador ++;
                    System.out.println(getCorredor() + " avanzó al metro " + contador);
                }
                if (contador == 10){


                    if(ganador == null){

                       ganador = getCorredor();
                    } 
                    enMeta = true;
                    System.out.println(getCorredor() + " llegó a la meta.");
                }
                

            }while(!enMeta);

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }
    }
}