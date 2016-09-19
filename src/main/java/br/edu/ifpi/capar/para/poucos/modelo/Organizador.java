package br.edu.ifpi.capar.para.poucos.modelo;

/**
 *
 * @author Lucas Rafael
 * @author Arllayne Carvalho
 */
public class Organizador {

    private int id;
    private int cpf;
    private int contato;
    private String nome;
    private String agencia;
    private String email;

    /**
     * metodo que retorna o cpf do organizador
     *
     * @return cpf do organizador
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * metodo que seta o cpf do organizador
     *
     * @param cpf o cpf
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * metodo que retorna contato do organizador
     *
     * @return contato do organizador
     */
    public int getContato() {
        return contato;
    }

    /**
     * metodo que seta o contato do organizador
     *
     * @param contato o contato do organizador
     */
    public void setContato(int contato) {
        this.contato = contato;
    }

    /**
     * metodo que retorna nome do organizador
     *
     * @return nome do organizador
     */
    public String getNome() {
        return nome;
    }

    /**
     * metodo que seta o nome do organizador
     *
     * @param nome o nome do organizador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * metodo que retorna a agencia do organizador
     *
     * @return a agencia do organizador
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * metodo que seta a agencia do organizador
     *
     * @param agencia a agencia do organizador
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * metodo que retorna o email do organizador
     *
     * @return email do organizador
     */
    public String getEmail() {
        return email;
    }

    /**
     * metodo que seta o email do organizador
     *
     * @param email o email do organizador
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * metodo que retorna o id
     *
     * @return id do
     */
    public int getId() {
        return id;
    }

    /**
     * metodo que seta o id
     *
     * @param id o id
     */
    public void setId(int id) {
        this.id = id;
    }
}
