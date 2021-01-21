/*
* Daniel Bittan Graells
*/
public class Ejercicio9T6{
  public static void main(String[] args){
    int contador=0;
    int num;
    do{
      num=(int)(Math.random()*100)+1;
      System.out.print(num+" ");
      contador++;
    }while(num!=24);
    System.out.println("\n La cantidad de números generados es de "+ contador );
  }
}
    
