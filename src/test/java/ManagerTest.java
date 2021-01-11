import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("M", 001, 20000, "HQ");
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals(001, manager.getNiNumber());
    }

    @Test
    public void managerHasName(){
        assertEquals("M", manager.getName());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(20000, manager.getSalary(), 0.1);
    }

    @Test
    public void getDeptName(){
        assertEquals("HQ", manager.getDept());
    }

    @Test
    public void raiseSetSalary(){
        assertEquals(21000, manager.setSalary(21000.00), 0.1);
    }

    @Test
    public void calcBonus(){
        assertEquals(200, manager.calcBonus(), 0.1);
    }

    @Test
    public void payBonus(){
        Double bonus = manager.calcBonus();
        assertEquals(20200, manager.payBonus(bonus), 0.1);
    }

    @Test
    public void raiseSalary(){
        assertEquals(20200, manager.raiseSalary(1.0), 0.1);
    }


}
