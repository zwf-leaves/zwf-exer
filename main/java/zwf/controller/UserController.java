package zwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zwf.dao.EmployeeMapper;
import zwf.pojo.Employee;
import zwf.service.Employeeservice;

/**
 * @author zwf
 * @create 2020-10-21-13:53
 */
@Controller
public class UserController {
    @Autowired
    Employeeservice employeeservice=null;

    @RequestMapping("/emp")
    public String selectOne(Integer id, Model model){

        Employee employee = employeeservice.selectOne(id);
        model.addAttribute("emp",employee);
        return "success";

    }
}
