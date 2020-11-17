/*
* Daniel Bittan Graells
*/
public class Ejercicio8T5{
  public static void main(String[] args){
    System.out.println("Introduce el número a multiplicar");
    int num = Integer.parseInt(System.console().readLine());
    for (int i=0; i<=10; i++){
      System.out.println(num + "x" + i + "=" + (num*i));
    }
  }
}
  
  
