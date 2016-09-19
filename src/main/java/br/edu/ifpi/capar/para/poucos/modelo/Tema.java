package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */

public class Tema {
    private int id;
    private String nome;
    private String descricao;
    /**
     * metodo que retorna o id
     *
     * @return id
     */

    public int getId() {
        return id;
    }

    /**
     * metodo que seta o id do participante
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
 /**
     * metodo que retorna o nome
     * @return nome do tema
     */
    public String getNome() {
        return nome;
    }
  /**
     * metodo que seta o nome
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
     * metodo que retorna a descricao do tema
     * @return descricao do tema
     */
    public String getDescricao() {
        return descricao;
    }
  /**
     * metodo que seta a descricao
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
