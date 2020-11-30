/*
* Daniel Bittan Graells
*/
public class Ejercicio11T7{
  public static void main(String[] args){
    int [] num= new int[10];
    int [] primo= new int[10];
    int [] noprimo= new int [10];
    int i;
    int j;
    int primos=0;
    int noprimos=0;
    boolean esPrimo=false;
    
    System.out.println("Introduce 10 enteros");
    
    for(i=0;i<10;i++){
      num[i]=Integer.parseInt(System.console().readLine());
      
      esPrimo=true;
      for(j=2;j<num[i]-1;j++){
        if(num[i]%j==0){
          esPrimo=false;
        }
      }
      if(esPrimo){
        primo[primos++]=num[i];
      }else{
        noprimo[noprimos++]=num[i];
      }
    }
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
    for(i=0; i<primos; i++){
      num[i]= primo[i];
    }
    for(i=primos;i<10;i++){
      num[i]= noprimo[i-primos];
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
      System.out.printf("|%4d  |",num[i]);
    }
    System.out.println("\n|---------------------------------------------------------------------|"); 
  }
}
