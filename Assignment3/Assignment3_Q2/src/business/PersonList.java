/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONY
 */
public class PersonList {

    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public Person searchPerson(String pid) {
        for (Person person : personList) {
            if (person.getPersonID().equals(pid)) {
                return person;
            }
        }
        return null;
    }

    public Person addPerson() {
        Person p = new Person();
        this.personList.add(p);
        return p;
    }

    public void deletePerson(Person p) {
        personList.remove(p);
    }

}
