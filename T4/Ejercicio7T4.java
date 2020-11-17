/*
* Daniel Bittan Graells
*/
public class Ejercicio7T4{
  public static void main(String[] args){
    System.out.println("calculo de la media de tres notas");
    System.out.println("Coloca la primera nota");
    Double primera= Double.parseDouble(System.console().readLine());
    System.out.println("Coloca la segunda nota");
    Double segunda= Double.parseDouble(System.console().readLine());
    System.out.println("Coloca la tercera nota");
    Double tercera= Double.parseDouble(System.console().readLine());
    Double media = (primera+segunda+tercera)/3;
    System.out.printf("La media es %.2f\n", media);
  }
}

