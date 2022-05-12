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
public class Devloper implements Employee {

    private String name;
    private long empId;
    private String position;

    public Devloper(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetail() {
         System.out.println(empId + " " + name );
    }

    
}
