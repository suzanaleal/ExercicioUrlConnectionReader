/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream;

import sr.ifes.edu.br.stream.file.ArquivoFileStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class ExercicioStreamTest {
    
    public ExercicioStreamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ExercicioStream.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ArquivoFileStream.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
