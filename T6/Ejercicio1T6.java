/*
* Daniel Bittan Graells
*/
public class Ejercicio1T6{
  public static void main(String[] args){
    int tirada;
    int suma=0;
    System.out.println("Tiramos los dados");
    for(int i=0;i<3;i++){
      tirada=((int)(Math.random()*6)+1);
      System.out.print(tirada+ " ");
      suma+=tirada;
    }
    System.out.println("Su suma es = " + suma);
  }
}
