package vascopanigi.u5_w2_d5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vascopanigi.u5_w2_d5.entities.Employee;
import vascopanigi.u5_w2_d5.repositories.EmployeeRepository;
import vascopanigi.u5_w2_d5.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // 1. GET DAJE

    @GetMapping
    public Page<Employee> getAllEmployees(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestParam(defaultValue = "id") String sortBy){
        return this.employeeService.getAllEmployees(pageNum, pageSize, sortBy);
    }
}
