import java.util.*;
import java.io.*;

public class Main{

    //Manejo de archivos 
    public static void main(String[] args){

        menu();
    }

    public static void agregarActividad(Scanner sc){

        System.out.print("Ingrese la actividad: ");
        String actividad = sc.nextLine(); 

        try(FileWriter agregar = new FileWriter("actividades.txt", true)){

            agregar.write(actividad + System.lineSeparator());
            System.out.println("\nActividad agregada.");
        
        }catch(IOException e){

            System.out.println("Error al guardar el archivo.");
        }
    }

    public static void mostrarActividad(){


        try(BufferedReader lectura = new BufferedReader(new FileReader("actividades.txt"))){

            String linea;

            System.out.println("\nACTIVIDADES REGISTRADAS\n");

            while((linea = lectura.readLine()) != null){

                System.out.println(linea);
            }

        }catch(FileNotFoundException e){

            System.out.println("No hay atividades registradas aún.");
        }
        catch(IOException e){

            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    public  static void menu(){

        Scanner sc = new Scanner(System.in);

        int opc = 0;

        do{

            try{

                System.out.println("\n1. Agrgar actividad.");
                System.out.println("2. Mostrar actividades.");
                System.out.println("3. Salir.");
                
                System.out.print("\nELija una opción: ");
                opc = sc.nextInt();
                sc.nextLine();

                switch(opc){

                    case 1:

                        agregarActividad(sc);
                        break;

                    case 2:

                        mostrarActividad();
                        break;

                    case 3:

                        System.out.println("Saliendo del programa...");
                        break;

                    default:

                        System.out.println("\nOpcion invalida.");
                        break;
                }

            }catch(InputMismatchException e){

                System.out.println("Error: Debe ingresar un opción válida.");
                sc.nextLine();
            }

        }while(opc != 3);
        sc.close();
    }
}

   

