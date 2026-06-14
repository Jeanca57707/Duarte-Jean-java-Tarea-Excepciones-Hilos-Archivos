import java.util.*;

public class Main{

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int edad;
        try{

            System.out.print("Ingrese una edad: ");
            edad = sc.nextInt();
            ValidarEdad.validarEdad(edad);

        }catch(EdadInvalidaExcepcion e){

            System.out.println("Error: " + e.getMessage());
        }
    }
}