/*
* Daniel Bittan Graells
*/
import matematicas.FuncionesMatematicas;
public class Ejercicio15T8{
  public static void main(String[] args){
    int i;
    System.out.println("Muestra los números primos entre 1 y mil");
    for(i=1;i<=1001;i++){
      matematicas.FuncionesMatematicas.esPrimo(i);
      if(matematicas.FuncionesMatematicas.esPrimo(i)==true){
        System.out.println(i + " es un número primo");
      }
    }
  }
}
