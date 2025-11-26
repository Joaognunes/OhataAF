package calculadora;

/**
 * Classe de teste para a Calculadora.
 */
public class TesteCalculadora {

    /**
     * Método principal que executa vários testes da classe Calculadora.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.calcular(2, 3, "+");
        calc.calcular(10, 4, "-");
        calc.calcular(3, 5, "*");
        calc.calcular(8, 2, "/");
        calc.calcular(8, 0, "/");
        calc.calcular(5, 5, "x");
    }
}
