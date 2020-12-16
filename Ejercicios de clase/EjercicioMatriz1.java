/*
* Daniel Bittan Graells
*/
import java.util.Scanner;
public class EjercicioMatriz1{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número de valores: ");
    int nummat=Integer.parseInt(s.nextLine());
    System.out.print("Introduce el min: ");
    int min= Integer.parseInt(s.nextLine());
    System.out.print("Introduce el max: "); 
    int max= Integer.parseInt(s.nextLine());
    int[] valores= new int[nummat];
    int i;
    int [] par=new int [nummat];
    int [] impar=new int [nummat];
    int numval=0;
    int[] posicion= new int [nummat];
    
    for(i=0;i<nummat;i++){
      valores[i]=(int)(Math.random()*(max+1)-min)+min;
      numval++;   
      posicion[i]=numval;
    }
    for(i=0;i<nummat;i++){
      System.out.printf("%4d  |" ,valores[i]);
    }
    for(i=0;i<nummat;i++){
      if(valores[i]%2==0){
        par[i]=valores[i];
      }else{
        impar[i]=valores[i];
      }
    }
    System.out.println("\nLas posiciones pares tienen números impares");
    for(i=0;i<nummat;i++){
      if(posicion[i]%2==0){
        System.out.print(impar[i]+" ");
      }else{
        System.out.print(par[i]+" ");
      }
    }
  }
}
