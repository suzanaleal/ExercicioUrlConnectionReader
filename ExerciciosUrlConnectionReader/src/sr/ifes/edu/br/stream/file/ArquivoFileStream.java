/*
Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */
package sr.ifes.edu.br.stream.file;

import java.io.*;

/**
 *
 * @author felipe
 */
public class ArquivoFileStream {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        File inputFile = new File(current + "\\src\\arquivo_entrada.txt");
        
        for(int i=1;i<3;i++){
            
            File outputFile = new File(current + "\\src\\arquivo_saida"+i+".txt");
         
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
        
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);            
                System.out.print((char)c);
            
            }
        
            System.out.println();
            in.close();
            out.close();
        
            System.out.println("Arquivo gerado em: " + outputFile.getAbsolutePath());
        }
    }
}
   
