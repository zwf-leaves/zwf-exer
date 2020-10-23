package zwf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zwf.dao.EmployeeMapper;
import zwf.pojo.Employee;

/**
 * @author zwf
 * @create 2020-10-21-14:08
 */
@Service
public class Employeeservice {
    @Autowired
    EmployeeMapper employeeMapper=null;

    public Employee selectOne(Integer id){
        Employee employee = employeeMapper.selectByPrimaryKey(id);

        return employee;
    }

}
