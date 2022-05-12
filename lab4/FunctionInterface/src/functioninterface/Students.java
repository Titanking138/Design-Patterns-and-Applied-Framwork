/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author admin
 */
public class Students {

    String name;
    int marks;
    
    public Students() {
    }

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return " Name --> "+getName()+" Marks --> "+ getMarks(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        List<Students> students = new ArrayList<>();
        students.add(new Students("Arjun", 99));
        students.add(new Students("xyz", 50));
        
        List<Students> filterStudents = filterByMarks(students,(Students s) -> s.getMarks() > 90);
    }
    
    public static List<Students> filterByMarks(List<Students> students, Predicate<Students> predicate)
    {
        List<Students> result = new ArrayList<>();
        for(Students s : students)
        {
            if(predicate.test(s))
            {
                result.add(s);
                System.out.println(s.toString());
            }
        }
        return result;
    }
    
}
