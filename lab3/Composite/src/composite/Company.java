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
public class Company
{
	public static void main (String[] args)
	{
		Devloper dev1 = new Devloper(100, "Vatsal Malaviya", "Pro Developer");
		Devloper dev2 = new Devloper(101, "Tarang Mavani", "Developer");
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(dev1);
		engDirectory.addEmployee(dev2);
		
		Manager man1 = new Manager(200, "Arjun Maniya", "SEO Manager");
		Manager man2 = new Manager(201, "Kevla Merja", "Arjun's Manager");
		
		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);
	
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetail();
	}
}

