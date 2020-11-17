/*
* Daniel Bittan Graells
*/
public class Ejercicio12T3{
  public static void main(String[] args){
    System.out.println("Introduce tu primera nota");
    Double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota que quieras obtenere al final del trimestre");
    Double notafinal = Double.parseDouble(System.console().readLine());
    Double nota2 = ((notafinal*100)-(nota1*40))/60;
    System.out.print("Para tener un " + notafinal + " al finalizar el trimestre, necesitas un " + nota2 + " en el segundo examen");
  }
}
    
