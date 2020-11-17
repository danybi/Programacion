/*
* Daniel Bittan Graells
*/
public class Ejercicio4T4{
  public static void main(String[] args){
    System.out.println("Introduce el número de horas trabajadas en una semana");
    int salarioNormal = 12;
    int salarioConExtra = 16;
    int horas = Integer.parseInt(System.console().readLine());
    if (horas<=40){
      System.out.println("Te corresponde " + (horas*salarioNormal) + "€ esta semana.");
    } else {
      System.out.println("Te corresponde " + (40*salarioNormal) + " con un extra de " + ((horas-40)*salarioConExtra) + "€ esta semana.");
    }
  }
}
