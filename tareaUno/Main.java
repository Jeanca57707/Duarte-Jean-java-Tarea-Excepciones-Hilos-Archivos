public class Main{

    public static void main(String[] args){

      Descargas archivo1 = new Descargas("archivo1", 10000);
      Descargas archivo2 = new Descargas("archivo2", 10000);
      Descargas archivo3 = new Descargas("archivo3", 10000);

       archivo1.start();
       archivo2.start();
       archivo3.start();
       
    }
}