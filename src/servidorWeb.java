

/**
 * Objetivo: Essa classe tem como o objetivo criar um servidor web
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
public class servidorWeb {

    public int ip;
    public String porta;
    public boolean ativadar;

    /**
     *
     * Objetivo: retorna um ip do servidor
     *
     * @return ip
     */
    public int getIp() {
        return ip;
    }

    /**
     * Objetivo: Resebe como parametro o ip do servidor
     *
     * @param ip
     */
    public void setIp(int ip) {
        this.ip = ip;
    }

    /**
     *
     * Objetivo: retorna a porta do servidor
     *
     * @return porta
     */
    public String getPorta() {
        return porta;
    }

    /**
     *
     * Objetivo: reseber a porta do servidor
     *
     * @param porta
     */
    public void setPorta(String porta) {
        this.porta = porta;
    }

    /**
     *
     * Objetivo: retornar se o servidor está ligado ou não
     *
     * @return ativadar
     */
    public boolean isAtivadar() {
        return ativadar;
    }

    /**
     * 
     * Objetivo: receber como parametro o ativador, para ativar o servidor
     *
     * @param ativadar
     */
    public void setAtivadar(boolean ativadar) {
        this.ativadar = ativadar;
    }

}
