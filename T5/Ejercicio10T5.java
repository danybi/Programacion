/*
* Daniel Bittan Graells
*/
public class Ejercicio10T5{
  public static void main(String[] args){
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;
    System.out.println("Este programa calcula la media de los numeros positivos introducidos y para cuando se introduce uno negativo.");
    while(numeroIntroducido>=0){
      numeroIntroducido= Double.parseDouble(System.console().readLine());
      numeros++;
      suma+= numeroIntroducido;
    }
    System.out.println("La media de los numeros introducidos es " + (suma-numeroIntroducido)/(numeros-1));
  }
}
