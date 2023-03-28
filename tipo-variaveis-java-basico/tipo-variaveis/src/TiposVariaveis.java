public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
      final  double VALOR_DE_PI = 3.14;
      int numero = 5;
      numero = -numero;


      String nomeCompleto = "Manoel " + "Titto";

      System.out.println(salarioMinimo);
      System.out.println(numeroCurto);
      System.out.println(numeroNormal);
      System.out.println(nomeCompleto);
      System.out.println(numero);

      numero = numero*  -1;

      System.out.println(numero);

      
    }
}
