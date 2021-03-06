package za.ac.cput.service.users;

import za.ac.cput.domain.users.Employee;
import za.ac.cput.service.IService;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> findAll();
    void deleteById (String id);
    Optional<Employee> findByEmail(String email);
}
