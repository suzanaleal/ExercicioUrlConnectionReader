/*
Exemplo de uma classe.
 */
package sr.ifes.edu.br.stream.serialization;

/**
 *
 * @author felipe
 */
public class Usuario{

    private String nome;
    private String email;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
   

}
