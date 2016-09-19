package br.edu.ifpi.capar.para.poucos.modelo;

/**
 *
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */
public class Inscricao {

    private int numero;
    private int codParticipante;

    /**
     * Método que retorna o numero da inscricao
     *
     * @return numero da inscricao
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que seta o numero da inscricao
     *
     * @param numero o numero da inscricao
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que retorna o codigo do participante da inscricao
     *
     * @return o codigo do participante da inscricao
     */
    public int getCodParticipante() {
        return codParticipante;
    }

    /**
     * Método que seta o codigo do participante da inscricao
     *
     * @param codigoparticipanteo codigo do participante da inscricao
     */
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
