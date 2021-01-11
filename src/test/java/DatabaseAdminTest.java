import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("M.Penny", 003, 20000);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(003, databaseAdmin.getNiNumber());
    }

    @Test
    public void HasName(){
        assertEquals("M.Penny", databaseAdmin.getName());
    }

    @Test
    public void HasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void raiseSetSalary(){
        assertEquals(21000, databaseAdmin.setSalary(21000.00), 0.1);
    }

    @Test
    public void calcBonus(){
        assertEquals(200, databaseAdmin.calcBonus(), 0.1);
    }

    @Test
    public void payBonus(){
        Double bonus = databaseAdmin.calcBonus();
        assertEquals(20200, databaseAdmin.payBonus(bonus), 0.1);
    }

    @Test
    public void raiseSalary(){
        assertEquals(20200, databaseAdmin.raiseSalary(1.0), 0.1);
    }

}
