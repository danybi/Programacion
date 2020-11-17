public class EjercicioBucle2 {
  public static void main(String[] args){
    int i;
    int num= 0;
    int numA;
    int numB;
    int suma;
    System.out.println("Introduce la cantidad de veces que quieres que se repita");
    num= Integer.parseInt(System.console().readLine());
    for(i=0; i<num; i++){
      System.out.println("Introduce entero 1");
      numA= Integer.parseInt(System.console().readLine());
      System.out.println("Introduce entero 2");
      numB= Integer.parseInt(System.console().readLine());
      
      suma= numA + numB;
      System.out.println("El resultado sería =" + suma);
    }
  }
}
       
