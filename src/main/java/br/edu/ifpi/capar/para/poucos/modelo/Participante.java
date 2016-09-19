package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */

public class Participante {
    private int id;
    private int cpf;
    private int rg;
    private int idade;
    private String nome;

 /**
     * metodo que retorna o cpf do participante 
     *
     * @return cpf do participante
     */
    public int getCpf() {
        return cpf;
    }
 /**
     * metodo que seta o cpf do participante
     *
     * @param cpf o cpf
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
 /**
     * metodo que retorna o rg do participante 
     *
     * @return rg do participante
     */
    public int getRg() {
        return rg;
    }
 /**
     * metodo que seta o rg do participante
     *
     * @param rg o rg
     */
    public void setRg(int rg) {
        this.rg = rg;
    }
/**
     * metodo que retorna a idade do participante 
     *
     * @return idade do participante
     */
    public int getIdade() {
        return idade;
    }
 /**
     * metodo que seta o idade do participante
     *
     * @param idade a idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
/**
     * metodo que retorna o nome do participante 
     *
     * @return nome do participante
     */
    public String getNome() {
        return nome;
    }
 /**
     * metodo que seta o nome do participante
     *
     * @param nome o nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
    * metodo que retorna o id do particpante
     * @return o id
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
}
