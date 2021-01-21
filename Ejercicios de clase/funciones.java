package menuf;
public class funciones{
  public static int menu(String[] x){
    int contador=1;
    int elegido=0;
    for(int i=0;i<4;i++){
      System.out.println(contador + x[i]);
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
    return opcion;
  }
}

  
  
