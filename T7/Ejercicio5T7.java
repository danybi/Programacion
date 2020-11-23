/*
* Daniel Bittan Graells
*/
public class Ejercicio5T7{
  public static void main(String[] args){
    int max= Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    
    int[] num = new int[10];
    System.out.println("Introduce 10 valores enteros");
    for(int i=0; i<10; i++){
      num[i]=Integer.parseInt(System.console().readLine());
      if(num[i]>max){
        max=num[i];
      }
      if(num[i]<min){
        min=num[i];
      }
    }
    System.out.println();
      
    for(int i=0; i<10; i++){
      System.out.print(num[i]);
      if(num[i]==max){
        System.out.print("=MAXIMO");
      }
      if(num[i]==min){
        System.out.print("=MINIMO");
      }
      System.out.println();
    }
  }
}
        
    
