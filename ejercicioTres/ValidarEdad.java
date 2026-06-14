public class ValidarEdad{

  public static void validarEdad(int edad)throws EdadInvalidaExcepcion{

    if(edad < 18){

      throw new EdadInvalidaExcepcion("Debe ser mayor de edad.");
    }
  }
}
