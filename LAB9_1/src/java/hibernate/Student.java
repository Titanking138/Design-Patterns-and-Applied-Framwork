package hibernate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT069 arjun
 */
public class Student {

    int id;
    String fname;
    String lname;
    int sem;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String fname, String lname, int sem) {
        this.fname = fname;
        this.lname = lname;
        this.sem = sem;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "student{" + "fname=" + fname + ", lname=" + lname + ", sem=" + sem + '}';
    }

}
