
/**
 * Objetivo: Essa classe tem como o objetivo criar uma calculadora que receba
 * três números
 *
 * @author Yuri Carneiro Adelino e Lucas Felipe
 *
 * @since Data de Criação 28/07/2016
 *
 *
 *
 * Desenvolvedor: >Lucas >Yuri
 *
 * ####################################
 *
 *
 *
 */
public class calculadora {

    public int a;
    public int b;
    public double dividir;

    /**
     *Objetivo: Obter a divisão dos 2 números a sobre b
     * 
     * @return Dividir
     */
    public double getDividir() {
        this.dividir = a / b;

        return dividir;
    }

    /**
     *
     * Objetivo: retornar um número digitado pelo usuario
     *
     * @return A
     */
    public int getA() {
        return a;
    }

    /**
     *
     * Objetivo: retornar um número digitado como número
     *
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     *
     * Objetivo: retornar um número digitado pelo usuario
     *
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     *
     * Objetivo: retornar um número digitado pelo usuário
     *
     * @return b
     */
    public void setB(int b) {
        this.b = b;
    }

}
