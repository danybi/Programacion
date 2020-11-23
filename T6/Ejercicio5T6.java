/*
* Daniel Bittan Graells
*/
public class Ejercicio5T6{
  public static void main(String[] args){
    int suma=0;
    int maximo=100;
    int minimo=199;
    int n;
    for(int i=0; i<50; i++){
      n=(int)(Math.random()*100)+100;
      System.out.print(n + " ");
      suma+=n;
      if(n > maximo){
      maximo=n;
      }
      if(n < minimo){
      minimo=n;
      }
    } 
     System.out.print("\nEl máximo es " + maximo + " \nel minimo " +minimo+ " \nsu suma " + suma); 
  }
}
