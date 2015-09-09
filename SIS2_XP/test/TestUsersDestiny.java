/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

/**
 *
 * @author irvin
 */
public class TestUsersDestiny {
    
    public TestUsersDestiny() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        List<String> rutaBus = new ArrayList<String>();
        rutaBus.add("Laguna");
        rutaBus.add("UMSS");
        rutaBus.add("Universidad Catolica");
        rutaBus.add("America");
        rutaBus.add("IC. Norte");
        rutaBus.add("America y Libertadores");
        rutaBus.add("America y Melchor Perez");
        rutaBus.add("IC. Norte");
        rutaBus.add("Blanco Galindo");
        Destino destino;
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TestVerificarDestino(){
        int idCliente = 805038;
        destino = new Destino(idCliente,"Laguna","IC. Norte");
        assertEquals(destino.Verificar(), "Destino Valido");
        
        destino = new Destino(idCliente,"IC. Norte","Laguna");
        assertEquals(destino.Verificar(), "Destino ya recorrido");
        
        destino = new Destino(idCliente,"IC. Norte","Circunvalacion");
        assertEquals(destino.Verificar(), "Destino no encuentrado");
        
        destino = new Destino(idCliente,"IC. Norte","IC. Norte");
        assertEquals(destino.Verificar(), "Ya se encuentra en el destino");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
