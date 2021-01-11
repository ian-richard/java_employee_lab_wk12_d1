import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Q", 002, 20000);
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals(002, developer.getNiNumber());
    }

    @Test
    public void HasName(){
        assertEquals("Q", developer.getName());
    }

    @Test
    public void HasSalary(){
        assertEquals(20000, developer.getSalary(), 0.1);
    }}
