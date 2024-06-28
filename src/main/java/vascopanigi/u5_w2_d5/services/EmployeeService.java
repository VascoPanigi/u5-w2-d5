package vascopanigi.u5_w2_d5.services;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vascopanigi.u5_w2_d5.entities.Employee;
import vascopanigi.u5_w2_d5.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Cloudinary cloudinary;

    public Page<Employee> getAllEmployees(int pageNum, int pageSize, String sortBy){
        if(pageSize>50) pageSize = 50;
        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(sortBy));
        return employeeRepository.findAll(pageable);
    }

    
}
