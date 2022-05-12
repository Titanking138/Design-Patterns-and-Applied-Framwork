/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author IT069 arjun
 */
import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetail() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetail();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
