/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.State.StateDirectory;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Country extends Organization {

    private String name;
    private StateDirectory stateList;
    private EmployeeDirectory personList;
    private ArrayList<Employee> empList;

    public ArrayList<Employee> getEmpList() {
        return empList;
    }
    

    public void addEmployeeToArraylist(Employee e){
        empList.add(e);
    }
    
    public Country(String name) {
        super(name);
        setName(name);
        stateList = new StateDirectory();
        personList = new EmployeeDirectory();    
        empList = new ArrayList<>();
    }

    public EmployeeDirectory getPersonList() {
        return personList;
    }

    public StateDirectory getStateList() {
        return stateList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
