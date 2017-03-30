/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Suzana
 */
public class RecuperarBlogSerializado {
    public static void main(String[] args) throws Exception 
    {
        BlogSerializado blog = null;
        String current = new java.io.File(".").getCanonicalPath();
        
        //Carrega o arquivo
        FileInputStream fileIn = new FileInputStream(current + "\\src\\blog_serializado.txt");
        
        //Classe responsável por recuperar os objetos do arquivo
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        blog = (BlogSerializado)in.readObject();
        
        System.out.println("Deserializando o Blog...");
        System.out.println("URL: " + blog.getUrl());
        System.out.println("Descrição: " + blog.getDescricao());
        System.out.println("Categoria: " + blog.getCategoria());
    }
}
