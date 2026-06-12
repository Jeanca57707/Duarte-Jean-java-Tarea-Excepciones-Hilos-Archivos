public class Descargas extends Thread{

    private String nombreArchivo;
    private int tiempo;

    public Descargas(){
        
        setNombre("");
        setTiempo(0);
    }

    public Descargas(String nombreArchivo, int tiempo){

        setNombre(nombreArchivo);
        setTiempo(tiempo);
    }

    public void setNombre(String nombreArchivo){

        this.nombreArchivo = nombreArchivo;
    }
    public void setTiempo(int tiempo){

        this.tiempo = tiempo;
    }

    public String getNombre(){
        return nombreArchivo;
    }
    public int getTiempo(){
        return tiempo;
    }

    @Override

    public void run(){

        try{

            System.out.println("Descargando " + getNombre());
            
            for(int i = 1; i < 11; i++){

                Thread.sleep(2000);
                System.out.println(getNombre() + " " + (i*10) + "% ");
            }

            Thread.sleep(getTiempo());

            System.out.println(getNombre() + " completado.");

        }catch(InterruptedException e){

            System.out.println(e.getMessage());
        }
    }




}