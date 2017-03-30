/*
 Classe de dominio que representa o endereco do usuario
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.Serializable;

/**
 *
 * @author felipe
 */
public class EnderecoSerializado implements Serializable {
    
    private String rua;
    private String bairro;
    private String cidade;    
    
    
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
