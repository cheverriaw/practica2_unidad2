/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nel500
 */
public class ContainerTest {

    static junit.framework.Test suite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ContainerTest() {
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
     * Test of add method, of class Container.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Package b = null;
        Container instance = new Container();
        boolean expResult = true;
        boolean result = instance.add(b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class Container.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Package b = null;
        Container instance = new Container();
        boolean expResult = false;
        boolean result = instance.remove(b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVolume method, of class Container.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Container instance = new Container();
        double expResult = 0.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of size method, of class Container.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Container instance = new Container();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of clear method, of class Container.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Container instance = new Container();
        instance.clear();
       
    }

    /**
     * Test of contains method, of class Container.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Package b = null;
        Container instance = new Container();
        boolean expResult = false;
        boolean result = instance.contains(b);
        assertEquals(expResult, result);
       
    }
    
}
