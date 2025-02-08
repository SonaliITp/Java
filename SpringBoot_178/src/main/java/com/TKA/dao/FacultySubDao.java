package com.TKA.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.TKA.entity.Faculty;
import com.TKA.entity.Subject;

@Repository
public class FacultySubDao {
	
    public ArrayList<Faculty> allFacultysubinfo()
    {
    	
    	ArrayList<Subject> subList1 = new ArrayList<Subject>();
    	subList1.add(new Subject(1,"Java"));
    	subList1.add(new Subject(2,"Python"));
    	
    	ArrayList<Subject> subList2 = new ArrayList<Subject>();
    	subList2.add(new Subject(3,"Mern"));
    	subList2.add(new Subject(4,"Testing"));
    	
    	ArrayList<Subject> subList3 = new ArrayList<Subject>();
    	subList3.add(new Subject(4,"Android"));
    	subList3.add(new Subject(5,"AWS"));
    	
    	ArrayList<Faculty> alfacultywithsub = new ArrayList<Faculty>();
    	alfacultywithsub.add(new Faculty(111,"Rohit",6,45000,subList1));
    	alfacultywithsub.add(new Faculty(234,"Amol",3,23000,subList2));
    	alfacultywithsub.add(new Faculty(345,"Anushaka",8,67000,subList3));
    	    	
    	return alfacultywithsub ;
    }

}
