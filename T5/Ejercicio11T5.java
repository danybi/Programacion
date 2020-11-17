/*
* Daniel Bittan Graells
*/
public class Ejercicio11T5{
  public static void main(String[] args){
    int i;
    int NI;
    System.out.println("Introduce el numero a mostrar");
    NI = Integer.parseInt(System.console().readLine());
    for (i=NI; i<NI+5; i++){
      System.out.println(i+ "   " + (i*i) + "   " + (i*i*i));
    }
  }
}
