/*
* Daniel Bittan Graells
*/
public class Ejercicio7T7{
  public static void main(String[] args){
    int[] num = new int[100];
    int i;
    String rojo= "\33[31m";
    String amarillo= "\33[33m";
    
    for(i=0; i<100;i++){
      num[i]=(int)(Math.random()*21);
      System.out.print(num[i]+" ");
    }
    System.out.println("\nIntroduzca un entero de los mostrados");
    int valor1= Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un entero para sustituir el anterior");
    int valor2= Integer.parseInt(System.console().readLine());
    
    for(i=0;i<100;i++){
      if(num[i]==valor1){
      num[i]=valor2;
      System.out.print(rojo +"\""+num[i]+"\" ");
      } else {
        System.out.print(amarillo+num[i]+" ");
      }
    }
  }
}
