/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author nel500
 */
public class PackageTest extends TestCase {
    
    public PackageTest(String testName) {
        super(testName);
    }
    
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getVolume method, of class Package.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Package instance = new Package(1.0);
        double expResult = 1.0;
        double result = instance.getVolume();
        assertEquals(expResult, result);
    }
    
}
