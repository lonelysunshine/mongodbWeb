package cn.dmlove.medical.service;

import java.util.List;

import cn.dmlove.medical.model.Employee;

/**
 * Created by wanglj on 15/11/22.
 */
public interface EmployeeService {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);

}
