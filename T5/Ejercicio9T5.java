/*
* Daniel Bittan Graells
*/
public class Ejercicio9T5{
  public static void main(String[] args){
    int numeroDeDigitos = 1, n, numeroIntroducido;
    System.out.println("Introduzca un entero y te digo cuantos digitos tiene");
    numeroIntroducido=Integer.parseInt(System.console().readLine());
    n=numeroIntroducido;
    
    while(n>10){
    n/=10;
    numeroDeDigitos++;
    }
    System.out.println(numeroIntroducido+ " tiene " + numeroDeDigitos + " digitos ");
  }
}
  
