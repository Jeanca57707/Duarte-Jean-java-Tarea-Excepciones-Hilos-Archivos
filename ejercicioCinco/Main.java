import java.util.*;

public class Main{

    //Manejo de archivos 
    public static void main(String[] args){





    }

    public static void agregarActividad(){


    }

    public static void mostrarActividad(){


    }
    public  static void menu(){

        Scanner sc = new Scanner(System.in);

        int opc = 0;


        do{

            try{

                System.out.println("\n1. Agrgar actividad.");
                System.out.println("2. Mostrar actividades. ");
                System.out.println("3.Salir.");
                
                System.out.print("\nELija una opción: ");
                opc = sc.nextInt();
                sc.nextLine();

                switch(opc){



                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    default:

                        System.out.println("\Opcion invalida.");
                        break;
                }

            }catch(InputMismatchException e){

                System.out.println(e.getMessage());
                sc.nextLine();
            }


        }while(opc != 3);
        sc.close();
    }
}