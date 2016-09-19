package br.edu.ifpi.capar.para.poucos.modelo;

/**
 *
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */
public class Contratante {

    private int id;
    private int cpf;
    private String nome;
    private String endereco;

    /**
     * @return retorna cpf da classe comtratante
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf insere cpf do contratante
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return retorna nome da classe comtratante
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome insere nome do contratante
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna Endereco da classe comtratante
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param Endereco insere endereco do contratante
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return retorna id da classe comtratante
     */
    public int getId() {
        return id;
    }

    /**
     * @param id insere endereço cpf do contratante
     */
    public void setId(int id) {
        this.id = id;
    }
}
