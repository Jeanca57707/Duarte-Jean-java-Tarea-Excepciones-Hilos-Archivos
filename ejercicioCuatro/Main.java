import java.util.*;

public class Main{

    public static void main(String[] args){

        menu();
    }

    public static void menu(){

        Calculadora calculadora = new Calculadora();

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        int num1 = 0;
        int num2 = 0;

        do{

            try{
                System.out.println("\n1. Sumar.");
                System.out.println("2. Restar..");
                System.out.println("3. Multiplicar.");
                System.out.println("4. Dividir");
                System.out.println("5. Salir.");

                System.out.print("\nElija una opcion: ");
                opc = sc. nextInt();
                sc.nextLine();

                switch(opc){

                    case 1:
                        System.out.print("Ingrese el primer numero: ");
                        num1 = sc.nextInt();

                        System.out.print("Ingrese el primer numero: ");
                        num2 = sc.nextInt();

                        System.out.println("\n" + calculadora.suma(num1, num2));
                        break;

                    case 2:

                        System.out.print("Ingrese el primer numero: ");
                        num1 = sc.nextInt();

                        System.out.print("Ingrese el primer numero: ");
                        num2 = sc.nextInt();

                        System.out.println("\n" + calculadora.resta(num1, num2));
                        break;

                    case 3:

                        System.out.print("Ingrese el primer numero: ");
                        num1 = sc.nextInt();

                        System.out.print("Ingrese el primer numero: ");
                        num2 = sc.nextInt();

                        System.out.println("\n" + calculadora.multiplicacion(num1, num2));
                        break;

                    case 4:

                        System.out.print("Ingrese el primer numero: ");
                        num1 = sc.nextInt();

                        System.out.print("Ingrese el primer numero: ");
                        num2 = sc.nextInt();

                        System.out.println("\n" + calculadora.division(num1, num2));
                        break;

                    case 5:

                        System.out.println("\nSaliendo del programa...");
                        break;

                    default:

                        System.out.println("\nOpcion invalida");
                        break;
                }

            }catch(ArithmeticException e){

                System.out.println("\nError: No puede dividir entre cero.");
            }
            catch(InputMismatchException e){

                System.out.println("\nError: Debe ingresar un numero valido.");
                sc.nextLine();
            }
            finally{

                System.out.println("\nProceso finalizado.");
            }

        }while(opc != 5);

    }
}