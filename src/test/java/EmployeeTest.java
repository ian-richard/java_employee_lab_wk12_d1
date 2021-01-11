import org.junit.Test;
import staff.Employee;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Test
    public void managerAsEmployee(){
        employee = new Manager("J.Bond", 007, 10000, "Secret Service");
        assertEquals("J.Bond", employee.getName());

    }


}
