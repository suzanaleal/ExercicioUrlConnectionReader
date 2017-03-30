/*
Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.*;

/**
 *
 * @author felipe
 */
public class SaveUsuarioSerializado {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        UsuarioSerializado usuarioSerializado = new UsuarioSerializado();
        usuarioSerializado.setEmail("joao@email.com");        
        usuarioSerializado.setNome("joao");
        usuarioSerializado.setSenha("password");
               
        FileOutputStream fileSerializado = new FileOutputStream( current + "\\src\\usuario_serializado.txt");        
        BufferedOutputStream bufferSerializado = new BufferedOutputStream(fileSerializado);
        ObjectOutputStream outputSerializado = new ObjectOutputStream(bufferSerializado);        
        outputSerializado.writeObject(usuarioSerializado);
        outputSerializado.close();
        
        System.out.println("Usuario Salvo");
        
        System.out.println("Arquivo gerado em: " + current + "\\src\\usuario_serializado.txt");
        
        /*
        Usuario usuario;
        usuario = new Usuario();
        usuario.setEmail("joao@email.com");        
        usuario.setNome("joao");
        usuario.setSenha("password");
        
        OutputStream file = new FileOutputStream( current + "\\src\\usuario.txt");
        OutputStream buffer = new BufferedOutputStream(file);
        ObjectOutput output = new ObjectOutputStream(buffer);
        output.writeObject(usuario);
        output.close();
        
        */
        
        
    }
}

   
