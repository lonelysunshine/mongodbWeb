package cn.dmlove.medical.dao;

import java.util.List;

import cn.dmlove.medical.model.Employee;

/**
 * Created by wanglj on 15/11/22.
 */
public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}
