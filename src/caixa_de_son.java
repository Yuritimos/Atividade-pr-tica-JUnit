package exercicio;

/**
 * Objetivo: Essa classe tem como o objetivo criar um objeto caixa de son
 *
 *
 * @author Yuri Carneiro Adelino e Lucas Felipe
 *
 * @since Data de Criação 28/07/2016
 *
 *
 *
 * Desenvolvedor: 
 * >Lucas 
 * >Yuri
 *
 * ####################################
 *
 *
 *
 */
public class caixa_de_son {

    public boolean ligado;
    public int volume;
    public String marca;

    /**
     * Objetivo: Esse metodo retorna se a caixa tá ligado ou não 
     *
     * @return Ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     *
     * Objetivo: esse método resebe ligado como parametro
     *
     * @param ligado 
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * Objetivo: Esse método retona volume da caixa de son
     *
     * @return Volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     *
     * Objetivo: Esse método recebe volume como parametro
     *
     * @param volume 
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Objetivo: Esse método retorna marca da caixa de son
     *
     * @return Marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * Objetivo: Esse método recebe marca como parametro
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
