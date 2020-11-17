/*
* Daniel Bittan Graells
*/
public class Ejercicio35T5{
  public static void main(String[] args){
    System.out.println("Introduzca la altura de la X");
    int alturaInt=Integer.parseInt(System.console().readLine());
    
    int altura=1;
    int i=0;
    int espaciosInternos=alturaInt - 1;
    int espaciosPorDelante=0;
    
    if ((alturaInt<3)||(alturaInt%2==0)){
      System.out.println("No puede ser menor que 3 o par");
    } else {
      while(altura<alturaInt/2+1){
        for (i=1;i<=espaciosPorDelante;i++){
          System.out.print(" ");
        }
        System.out.print("*");
        for (i=1; i <espaciosInternos; i++){
          System.out.print(" ");
        }
        if(altura>1){
        System.out.print("*");
      }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos-=2;
      }
      espaciosInternos=0;
      espaciosPorDelante=altura/2;
      altura=1;
      while(altura<=alturaInt/2+1){
        for (i=1;i<=espaciosPorDelante;i++){
          System.out.print(" ");
        }
        System.out.print("*");
        for (i=1; i <espaciosInternos; i++){
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      }
    }
  }
}
      
        
        
    
    
