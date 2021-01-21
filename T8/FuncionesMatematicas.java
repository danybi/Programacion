/*
* Daniel Bittan Graells
*/
package matematicas;
public class FuncionesMatematicas{
  public static boolean esCapicua(long x){
    return x==volteado(x);
  }
  public static boolean esCapicua(int x){
    return esCapicua((long)x);
  }
  public static boolean esPrimo(long n){
    if(n<2){
      return false;
    }else{
      for(long i=n/2;i>=2;i--){
        if(n%i==0){
          return false;
        }
      }
    }
    return true;
  }
  public static boolean esPrimo(int n){
    return esPrimo((long)n);
  }
  public static int SigPrimo(int x){
    while (!esPrimo(++x)){};
    return x;
  }
  public static double Potencia(int base, int exponente){
    if(exponente==0){
      return 1;
    }
    
    if(exponente<0){
      return 1/potencia(base, -exponente);
    }
    int n=1;
    for(int i=0;i < Math.abs(exponente);i++){
      n=n*base;
    }
    return n;
  }
  public static int Digitos{
    
  
    
}
