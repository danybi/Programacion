/*
* Daniel Bittan Graells
*/
public class Ejercicio3T4{
  public static void main(String[] args){
    String dia;
    System.out.println("Introduce un numero y te digo que dia de la semana es");
    int n = Integer.parseInt(System.console().readLine());
    switch(n){
    case 1:
    dia = "lunes";
    break;
    case 2:
    dia = "martes";
    break;
    case 3:
    dia = "miercoles";
    break;
    case 4:
    dia = "jueves";
    break;
    case 5:
    dia = "viernes";
    break;
    case 6:
    dia = "sabado";
    break;
    case 7:
    dia = "domingo";
    break;
    default:
    dia = "Introduce un número del 1 al 7";
    }
    System.out.println(dia);
  }
}
  
    
    
