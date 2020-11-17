/*
* Daniel Bittan Graells
*/
public class Ejercicio8T3{
  public static void main(String[] args){
    System.out.println("Calculo semanal de un trabajador que gana 12€ la hora");
    System.out.println("Introduzca el número de horas trabajadas esta semana");
    int horastrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Según las horas de trabajo realizadas le corresponden: " + (horastrabajadas*12) + "€");
  }
}
