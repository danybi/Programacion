/*
* Daniel Bittan Graells
*/

import java.util.Scanner;
public class Ejercicio12T7{
  public static void main(String[] args){
    Scanner x= new Scanner(System.in);
    int [] resultado= new int[10];
    int [] num= new int[10];
    int inicial=0;
    int last=0;
    int i;
    boolean valido;
    System.out.println("Introduce 10 enteros");
    
    for(i=0;i<10;i++){
      num[i]=Integer.parseInt(x.nextLine());
    }
    do{
      valido=true;
      System.out.print("Introduce la posición inicial entre 0-9: ");
      inicial=Integer.parseInt(x.nextLine());
      if((inicial<0)||(inicial>9)){
        System.out.println("Valor incorrecto introduzca otro que sea entre 0-9");
        valido=false;
      }
      System.out.print("Introduce la posición final entre 0-9: ");
      last=Integer.parseInt(x.nextLine());
      if((last<0)||(last>9)){
        System.out.println("Valor incorrecto introduzca otro que sea entre 0-9");
        valido=false;
      }
      
      if(inicial>last){
        System.out.println("El valor inicial tiene que ser menor al final");
        valido=false;
      }
    }while(valido!=true);
            
    System.out.println("Original");
    System.out.println("\n|---------------------------------------------------------------------|");
    System.out.print("|Índice");
    for(i=0;i<10;i++){
      System.out.printf("|%4d  |" ,i);
    }
    System.out.println("\n|------|------|------|------|------|------|------|------|------|------|");
    System.out.print("|Valores");
    for(i=0;i<10;i++){
      System.out.printf("|%4d  |" ,num[i]);
    }
    System.out.println("\n|---------------------------------------------------------------------|"); 
    for(i=0;i<10;i++){
      resultado[i]=num[i];
    }
    resultado[last]=num[inicial];
    for(i=last;i<10;i++){
      resultado[i]=num[i-1];
      
      resultado[0]=num[9];
    }
    for(i=0;i<inicial;i++){
      resultado[i+1]=num[i];
    }      
    System.out.println("Array ordenado");
    System.out.println("\n|---------------------------------------------------------------------|");
    System.out.print("|Índice");
    for(i=0;i<10;i++){
      System.out.printf("|%4d  |",i);
    }
    System.out.println("\n|------|------|------|------|------|------|------|------|------|------|");
    System.out.print("|Valores");
    for(i=0;i<10;i++){
      System.out.printf("|%4d  |",resultado[i]);
    }
    System.out.println("\n|---------------------------------------------------------------------|"); 
  }
}
