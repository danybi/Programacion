/*
* Daniel Bittan Graells
*/
import matematicas.FuncionesMatematicas;
public class Ejercicio16T8{
  public static void main(String[] args){
    int i;
    System.out.println("Muestra los números que son capicua entre 1 y 99999");
    for(i=1;i<=100000;i++){
      matematicas.FuncionesMatematicas.esCapicua(i);
      if(matematicas.FuncionesMatematicas.esCapicua(i)==true){
        System.out.println(i+" Es capicua");
      }
    }
  }
}
