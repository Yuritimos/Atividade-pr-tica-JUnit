

/**
 * Objetivo: Essa classe tem como o objetivo reseber como parametro informações
 * do PC.
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
public class computador {

    public String serial;
    public String Sistema_operacional;
    public String programas_intalados;
    public int geração_do_processador;
    public boolean ligado;

    /**
     * Objetivo: retonar o serial do computador
     * 
     * @return serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     *Objetivo: resebe o serial do computador como parametro
     * 
     * @param serial
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * Objetivo: retonar o sistema operacional do computador
     *
     * @return Sistema_operacional
     */
    public String getSistema_operacional() {
        return Sistema_operacional;
    }

    /**
     * Objetivo: resebe o sistema operacional como parametro
     * 
     * @param Sistema_operacional
     */
    public void setSistema_operacional(String Sistema_operacional) {
        this.Sistema_operacional = Sistema_operacional;
    }

    /**
     * Objetivo: retorna os nomes dos programas instalados  
     * 
     * @return Programas_intalados
     */
    public String getProgramas_intalados() {
        return programas_intalados;
    }

    /**
     * Objetivo: Resebe os Programas intalados no computador
     * 
     * @param programas_intalados
     */
    public void setProgramas_intalados(String programas_intalados) {
        this.programas_intalados = programas_intalados;
    }

    /**
     * Objetivo: Retorna a geração do processador
     * 
     * @return Geração_do_processador
     */
    public int getGeração_do_processador() {
        return geração_do_processador;
    }

    /**
     * Objetivo: resebe como parametro a geração do processador
     * 
     * @param geração_do_processador
     */
    public void setGeração_do_processador(int geração_do_processador) {
        this.geração_do_processador = geração_do_processador;
    }
      
    /**
     * 
     * Objetivo: retorna dizendo se o computador está ligado ou não
     * 
     * @return Ligado
     */
    
    public boolean isLigado() {
        return ligado;
    }
     
    /**
     * 
     *  Objetivo: resebe como parametro um valor verdadeiro ou falso para o 
     *  método está ligado
     * 
     * 
     * @param ligado 
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
