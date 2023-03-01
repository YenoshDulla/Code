package com.has;

public class Name {
    String fname;
    String lname;
    String fullName;
    Name(final String fname,final String lname,final String fullName){
        this.fname=fname;
        this.lname=lname;
        this.fullName=fullName;
    }
    @Override
    public String toString() {
        return "Name [fname=" + fname + ", lname=" + lname + ", fullName=" + fullName + "]";
    }
   
}
