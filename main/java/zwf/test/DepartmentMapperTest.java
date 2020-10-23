package zwf.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zwf.dao.EmployeeMapper;

/**
 * @author zwf
 * @create 2020-10-21-13:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class DepartmentMapperTest {

    @Autowired
    EmployeeMapper employeeMapper=null;
    @Test
    public void selectByPrimaryKey() {
        System.out.println("员工信息");
        System.out.println(employeeMapper.selectByPrimaryKey(199));



    }
}