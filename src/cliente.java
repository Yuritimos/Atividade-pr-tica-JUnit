

/**
 * Objetivo: Essa classe tem como o objetivo criar um cliente
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
public class cliente {

    public int ip;
    public int porta;
    public boolean conectado;

    /**
     *
     * Objetivo:retornar o ip do cliente
     *
     * @return Ip
     */
    public int getIp() {
        return ip;
    }

    /**
     * Objetivo:Resebe ip do cliente como parametro
     *
     * @param ip
     */
    public void setIp(int ip) {
        this.ip = ip;
    }

    /**
     *
     * Objetivo: retorna a porta do cliente onde se comunicarar com o servidor
     * 
     * @return porta
     */
    public int getPorta() {
        return porta;
    }
/**
 * 
 * Objetivo: resebe a porta onde permitirá a via entre cliente e servidor como
 * parametro 
 * 
 * @param porta 
 */
    public void setPorta(int porta) {
        this.porta = porta;
    }
/**
 * 
 * Objetivo: Retorna, se está conectado com o servidor ou não
 * 
 * @return conectado
 */
    public boolean isConectado() {
        return conectado;
    }
/**
 * 
 * Objetivo: resebe como parametro se está conectado com sucesso
 * 
 * @param conectado 
 */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

}
