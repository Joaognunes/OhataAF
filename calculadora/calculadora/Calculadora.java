package calculadora;
/**
 * <p>A classe Calculadora disponibiliza operações matemáticas simples,
 * como soma, subtração, multiplicação e divisão. Seu objetivo é demonstrar
 * boas práticas de codificação, organização e documentação em Java.</p>
 *
 * <p>Recursos apresentados:</p>
 * <ul>
 *     <li>Uso de métodos puros</li>
 *     <li>Tratamento básico de erros</li>
 *     <li>Aplicação de JavaDoc para documentação de código</li>
 *     <li>Organização de lógica e boas práticas de programação</li>
 * </ul>
 *
 * <p>Os métodos desta classe são simples e diretos, retornando apenas
 * o resultado da operação solicitada, facilitando a leitura e a criação
 * de testes automatizados.</p>
 *
 * @author João Gabriel Lira Nunes
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza a soma entre dois valores inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma dos dois valores
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Executa a subtração entre dois valores inteiros.
     *
     * @param a valor inicial
     * @param b valor a ser subtraído
     * @return diferença entre a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Calcula a multiplicação entre dois inteiros.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return produto entre os dois números
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois valores inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão
     * @throws IllegalArgumentException se o divisor for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    /**
     * <p>Recebe dois valores e um operador matemático e executa a operação
     * correspondente ao símbolo informado.</p>
     *
     * <p>Operadores permitidos:</p>
     * <ul>
     *     <li>"+"</li>
     *     <li>"-"</li>
     *     <li>"*"</li>
     *     <li>"/"</li>
     * </ul>
     *
     * @param a primeiro número
     * @param b segundo número
     * @param operador símbolo da operação desejada
     * @return resultado da operação aplicada
     * @throws IllegalArgumentException se o operador não for reconhecido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operação desconhecida: " + operador);
        };
    }
}