/*
* Daniel Bittan Graells
*/
public class Ejercicio9T7{
  public static void main(String[] args){
    int [] num = new int[8];
    int i;
    System.out.println("Introduce 8 enteros");
    for(i=0;i<8;i++){
      num[i]=Integer.parseInt(System.console().readLine());
      if(num[i]%2==0){
        System.out.print(num[i] +" es par");
      }else{
        System.out.print(num[i] + " es impar");
      }
      System.out.println();
    }
  }
}
