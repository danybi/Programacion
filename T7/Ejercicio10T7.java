/*
* Daniel Bittan Graells
*/
public class Ejercicio10T7{
  public static void main(String[] args){
    int [] num= new int[20];
    int [] par= new int[20];
    int [] impar= new int[20];
    int i;
    int pares=0;
    int impares=0;
    for(i=0;i<20;i++){
      num[i]=(int)(Math.random()*101);
      if(num[i]%2==0){
        par[pares++]=num[i];
      }else{
      impar[impares++]=num[i];
      }
    }
    System.out.println("\nOriginal");
    for(i=0;i<20;i++){
      System.out.print(num[i]+" ");
    }
    System.out.println();
    for(i=0; i<pares; i++){
      num[i]= par[i];
    }
    for(i=pares;i<20;i++){
      num[i]= impar[i-pares];
    }
    System.out.println("Los pares al principio");
    for(i=0;i<20;i++){
      System.out.print(num[i]+" ");
    }
  }
}
      
    
    
