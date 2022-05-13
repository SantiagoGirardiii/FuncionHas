import java.io.*;
import java.util.Scanner;

public class FuncionHas {
    static long transformaClave(String clave)
{
long d;
d = 0;
for (int j = 0; j < Math.min(clave.length(),10); j++)
{
d = d * 27 + (int)clave.charAt(j);
}
if (d < 0) d = -d;
System.out.print("su clave en int es");
System.out.println(d);
return d;
}

public static boolean NoEsPrimo(Long numero) {
    // El 0, 1 y 4 no son primos
    if (numero == 0 || numero == 1 || numero == 4) {
      return true;
    }
    for (int x = 2; x < numero / 2; x++) {
      // Si es divisible por cualquiera de estos números, no
      // es primo
      if (numero % x == 0)
        return true;
    }
    // Si no se pudo dividir por ninguno de los de arriba, sí es primo
    return false;
  }

static long EncontrarTamañoTabla(Double Cantidaddeclaves){
    Double M=0.0;
    double R=0.8;
    M = Cantidaddeclaves/R;
    Long Tabla = M.longValue();
    while(NoEsPrimo(Tabla)){
        Tabla = Tabla + 1 ;
    }
    System.out.println("su tamaño de tabla es");
    System.out.println(Tabla);
    return Tabla;
}

static int Dispersion(long Claave , Long Taabla){
    long Numero = Claave % Taabla ;
    int cclave = (int)Numero;
    return cclave;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String  a = "asd";
    Double b = 0.0;
    Long c ;
    Long d ;
    int f;
    System.out.println("ingrese clave y luego la cantidad de claves");
    a = sc.nextLine();
    b = sc.nextDouble();
    c = transformaClave(a);
    d = EncontrarTamañoTabla(b);
    f = Dispersion(c, d);
    System.out.println("su clave es");
    System.out.print(f);

} 
}

