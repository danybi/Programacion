/*
* Daniel Bittan Graells
*/
public class Ejercicio13T5{
  public static void main(String[] args){
    int contNeg=0;
    int contPos=0;
    System.out.println("Introduce 10 números negativos o posivitos");
    for(int i=0; i<10; i++){
      double numInt=Double.parseDouble(System.console().readLine());
       if (numInt<0){
         contNeg++;
       } else {
         contPos++;
       }
    }
    System.out.println("De los 10, " + contPos + " son positivos y " +contNeg+ " Son negativos.");
  }
} 
     
       
      
