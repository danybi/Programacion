/*
* Daniel Bittan Graells
*/
public class Ejercicio4T7{
  public static void main(String[] args){
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for(int i=0; i<20; i++){
      num[i]=(int)(Math.random()*101);
      cuadrado[i]=num[i]*num[i];
      cubo[i]=cuadrado[i]*num[i];
    }
    
    System.out.println("\nA continuación se muestra un número junto a su cuadrado y a su cubo");
    
    System.out.println("|----------|----------|");
    for(int i=0; i<20; i++){
    System.out.printf("%4d|%5d|%8d\n" ,num[i],cuadrado[i],cubo[i]);
    } 
  }
}
      
      
