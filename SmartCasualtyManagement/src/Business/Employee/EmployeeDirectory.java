/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    

    public Employee createEmployee(String name) {

        Employee employee = new Employee();
        employee.setName(name);
        System.out.println(employee.getName());
        employeeList.add(employee);
        return employee;
    }

    public void removeEmployee(Employee e) {
        employeeList.remove(e);
    }

    public Employee searchEmployee(String key) {
        Employee e1 = null;
        for (Employee e : employeeList) {
            if (e.getId().equals(key)) {
                e1 = e;
            }
        }
        if (e1 == null) {
            JOptionPane.showMessageDialog(null, "Employee not found!");
        }
        return e1;
    }
}
