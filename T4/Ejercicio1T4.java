/*
* Daniel Bittan Graells
*/
public class Ejercicio1T4{
  public static void main(String[] args){
    String dia;
    System.out.println("Introduce un día de la semana y te dire la primera asignatura del día");
    dia = System.console().readLine();
    dia.toLowerCase();
    
    switch (dia) {
      
      case "lunes":
      System.out.println("Programación");
      break;
      case "martes":
      System.out.println("Sistemas informaticos");
      break;
      case "miercoles":
      case "jueves":
      System.out.println("Programación");
      break;
      case "viernes":
      System.out.println("Sistemas informaticos");
      break;
      case "sabado":
      case "domingo":
      System.out.println("Ese día no hay clases");
      break;
      default:
      System.out.println("Ese día no existe");
    }
  }
}

    
