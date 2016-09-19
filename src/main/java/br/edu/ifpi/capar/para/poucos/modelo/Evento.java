package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/**
 * Classe que faz especificação de evento
 *
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */
public class Evento extends EntidadeGenerica {

    private String nome;
    private String data;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * Método que retorna o nome do evento
     *
     * @return Retorna o nome completo do evento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que seta o nome do evento
     *
     * @param nome O nome do evento propriamente dito
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna a data do evento
     *
     * @return Retorna a data do evento
     */
    public String getData() {
        return data;
    }

    /**
     * Método que seta a data do evento
     *
     * @param data a data evento
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Método que retorna o horario do evento
     *
     * @return Retorna o horario do evento
     */
    public int getHorario() {
        return horario;
    }

    /**
     * Método que seta o horario do evento
     *
     * @param horario o horario do evento
     */

    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * Método que retorna a idade minima do evento
     *
     * @return Retorna a idade minima do evento
     */
    public int getIdadeMinima() {
        return idadeMinima;
    }

    /**
     * Método que setaa idade minima do evento
     *
     * @param idademinima idade minima do evento
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    /**
     * Método que retorna o tipo do evento
     *
     * @return Retorna o tipo do evento
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Método que setaa idade minima do evento
     *
     * @param idademinima idade minima do evento
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
