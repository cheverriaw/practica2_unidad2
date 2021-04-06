package container;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class WarehouseTest extends TestCase {
    private Package[] b = null;
    private Warehouse Warehouse = null;
    private int num_Packages_To_Test = 5;
    private int Warehouse_Volume = num_Packages_To_Test - 1;
    private double package_Unit_Volume = 10.0;

   

    @Override
    protected void setUp() throws Exception {
        assertTrue("Test case error, you must test at least 1 Package",
                num_Packages_To_Test > 0);
        assertTrue("This test case is set up assuming that the Warehouse cannot contain all the Packages, please check and change parameters", num_Packages_To_Test > Warehouse_Volume);
        double Warehouse_capacity = 0;
        b = new Package[num_Packages_To_Test];
        for (int i = 0; i < num_Packages_To_Test; i++) {
            if (i < Warehouse_Volume) {
                Warehouse_capacity += (i + 1) * package_Unit_Volume;
            }
            b[i] = new Package((i + 1) * package_Unit_Volume);
        }

        Warehouse = new Warehouse(Warehouse_capacity);
    }

    public void testAdd() {
        Warehouse.clear();
        for (int i = 0; i < Warehouse_Volume; i++) {
            assertTrue("Warehouse.add(Package) failed to add a new Package!",
                    Warehouse.add(b[i]));
            assertFalse("Warehouse.add(Package) seems to allow the same package to be added twice!", Warehouse.add(b[i]));
            assertTrue("Warehouse does not contain a Package after it is supposed to have been added!", Warehouse.contains(b[i]));
        }
        for (int i = Warehouse_Volume; i < num_Packages_To_Test; i++) {
            assertFalse("Warehouse.add(Package) allows a Package to be added even though it is already full!", Warehouse.add(b[i]));
        }
    }

    public void testGetPackages() {
        Random rnd = new Random();
        Warehouse.clear();

        LinkedList<Package> list = new LinkedList<Package>();
        for (int i = 0; i < Warehouse_Volume; i++) {
            list.add(b[i]);
        }

        for (int i = 0; i < Warehouse_Volume; i++) {
            Warehouse.add(list.remove(rnd.nextInt(list.size())));
        }

        Iterator<Package> it = Warehouse.getPackages();
        int count = 0;
        while (it.hasNext() && count < Warehouse_Volume) {
            Package Package = it.next();
            assertTrue(
                    "Packages are not returned by Warehouse.getPackages()iterator in the correct order", b[count] == Package);
            if (b[count] != Package) {
                break;
            }
            count++;
        }
        assertEquals("Warehouse.getPackages() did not return all thePackages", Warehouse_Volume, count);
    }
}
