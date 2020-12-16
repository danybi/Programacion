/*
* Daniel Bittan Graells
*/
public class Ejercicio13T7{
  public static void main(String[] args){
    int [] num = new int[100];
    String destacar;
    int max=0;
    int min=500;
    int i;
    
    for(i=0;i<100;i++){
      num[i]=(int)(Math.random()*501);
      System.out.print(num[i]+" ");
      if(num[i]>max){
        max=num[i];
      }
      if(num[i]<min){
        min=num[i];
      }
    }
    System.out.println("\n¿Quieres destacar el máximo o el mínimo? (introduce el número 1-max, 2-min o 3-ninguno)");
    int opcion= Integer.parseInt(System.console().readLine());
    int destacado=0;
    if(opcion==1){
      destacado=max;
    }
    if(opcion==2){
      destacado=min;
    }
    if(opcion==3){
      System.out.print("No destacamos ninguno\n");
    }
    for(i=0;i<100;i++){
      if(num[i]==destacado){
        System.out.print("\033[33m**"+destacado+"\33[33m**");
      }else{
        System.out.print(num[i]+" ");
      }
    }
  }
}

    
    
