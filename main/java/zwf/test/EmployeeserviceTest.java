package zwf.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zwf.dao.EmployeeMapper;
import zwf.pojo.Employee;
import zwf.service.Employeeservice;

/**
 * @author zwf
 * @create 2020-10-21-14:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class EmployeeserviceTest {

    @Autowired
    Employeeservice employeeservice=null;

    @Test
    public void selectOne() {
        Employee employee = employeeservice.selectOne(100);
        System.out.println(employee);

    }
}