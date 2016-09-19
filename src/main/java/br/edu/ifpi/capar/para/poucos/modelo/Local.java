package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author  Arllayne Carvalho
 */

public class Local {
    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private String estado;
    private String rua;
    private int numero;
/**
     * Método que retorna o id do local
     *
     * @return id do local
     */
    public int getId() {
        return id;
    }
/**
     * Método que seta o id do local
     *
     * @param id o id do local
     */
    public void setId(int id) {
        this.id = id;
    }
/**
     * Método que retorna o nome
     *
     * @return nome do local
     */
    public String getNome() {
        return nome;
    }
/**
     * Método que seta o nome do local
     *
     * @param nome o nome do local
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
     * Método que retorna a capacidade
     *
     * @return capacidade do local
     */
    public int getCapacidade() {
        return capacidade;
    }
/**
     * Método que seta a capacidade do local
     *
     * @param capacidade  o capacidade do local
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
/**
     * Método que retorna a cidade
     *
     * @return cidade 
     */
    public String getCidade() {
        return cidade;
    }
/**
     * Método que seta a cidade
     *
     * @param cidade a cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
/**
     * Método que retorna o estado
     *
     * @return estado 
     */
    public String getEstado() {
        return estado;
    }
/**
     * Método que seta o estado
     * @param estado o estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Método que retorna a rua
     *
     * @return a rua 
     */

    public String getRua() {
        return rua;
    }
/**
     * Método que seta a rua
     * @param rua a rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }
    /**
     * Método que retorna o numero
     *
     * @return o numero do local 
     */
    public int getNumero() {
        return numero;
    }
/**
     * Método que seta o numero do local
     * @param numero o numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
