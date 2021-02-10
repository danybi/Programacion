package menuf;
public class funciones{
  public static int menu(String[] x){
    int contador=1;
    int elegido=0;
    for(int i=0;i<4;i++){
      System.out.println(contador +" "+ x[i]);
      contador++;
    }
    System.out.println("Elige una de las opciones: ");
    int opcion=Integer.parseInt(System.console().readLine());
    switch(opcion){
      case 1:
      elegido=0;
      break;
      case 2:
      elegido=1;
      break;
      case 3:
      elegido=2;
      break;
      case 4:
      elegido=3;
      break;
      default:
      System.out.println("Valor invalido");
    }
    return elegido;
  }
  public static int suma(int n, int m){
    /*
     * Suma los dos enteros elegidos.
     * 
     */
    int resultado = n+m;
    return resultado;
  }
  public static int resta(int n, int m){
    /*
     * Resta los dos enteros elegidos.
     * 
     */
    int resultado = n-m;
    return resultado;
  }
  public static int multiplicacion(int n, int m){
    /*
     * Multiplica los dos enteros elegidos.
     * 
     */
    int resultado = n*m;
    return resultado;
  }
}

  
  
