/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

/**
 *
 * @author Suzana
 */
import java.io.Serializable;

public class BlogSerializado implements Serializable {
    
    private String url;
    private String descricao;
    private String categoria;
    
    public BlogSerializado(String url, String descricao, String categoria)
    {
        super();
        this.url = url;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    public String getUrl()
    {
        return this.url;
    }
    
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String toString()
    {
        return "Url: " + this.url + "/" + "Descricao: " + this.descricao + "/" + "Categoria: " + this.categoria; 
    }
    
    
}
