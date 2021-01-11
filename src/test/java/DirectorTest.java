import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("PM", 004, 20000, "Gov", 100000.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000.00, director.getBudget(), 0.1);
    }
    @Test
    public void managerHasNiNumber(){
        assertEquals(004, director.getNiNumber());
    }

    @Test
    public void managerHasName(){
        assertEquals("PM", director.getName());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(20000, director.getSalary(), 0.1);
    }

    @Test
    public void getDeptName(){
        assertEquals("Gov", director.getDept());
    }

    @Test
    public void raiseSetSalary(){
        assertEquals(21000, director.setSalary(21000.00), 0.1);
    }

    @Test
    public void calcBonus(){
        assertEquals(200, director.calcBonus(), 0.1);
    }

    @Test
    public void payBonus(){
        Double bonus = director.calcBonus();
        assertEquals(20200, director.payBonus(bonus), 0.1);
    }

    @Test
    public void raiseSalary(){
        assertEquals(20200, director.raiseSalary(1.0), 0.1);
    }


}
