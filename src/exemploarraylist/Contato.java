package exemploarraylist;


public class Contato {
    
    private String nome;
    private String email;
    private String celular;

    public Contato() {
    }

    public Contato(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override       // sobreescrever o metodo para se comportar como string
    public String toString() {
        return nome + " : " + email + " - " + celular;
    }
    
    
    
    
}
