package cn.dmlove.medical.dao.impl;

import java.util.List;

import cn.dmlove.medical.dao.AbstractDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.dmlove.medical.model.Employee;
import cn.dmlove.medical.dao.EmployeeDao;

/**
 * Created by wanglj on 15/11/22.
 */
@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {

    public Employee findById(int id) {
        return getByKey(id);
    }

    public void saveEmployee(Employee employee) {
        persist(employee);
    }

    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
        Criteria criteria = createEntityCriteria();
        return (List<Employee>) criteria.list();
    }

    public Employee findEmployeeBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();
    }
}