package com.TKA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TKA.dao.FacultySubDao;
import com.TKA.entity.Faculty;
import com.TKA.entity.Subject;

@Service
public class FacultySubService {
	
	@Autowired
	FacultySubDao dao;
	
	public ArrayList<String> getAllFacultySubNames()
	{
		  ArrayList<String> slist = new ArrayList<String>();
		  ArrayList<Faculty> alfacultysubList = dao.allFacultysubinfo();
		  
		  for(Faculty faculty :alfacultysubList)
		  {                                                       
			  List<Subject> sublist = faculty.getSubNames();
			  for(Subject subject:sublist)
			  {
				 slist.add(subject.getSubName());
			  }
		  }
		return slist;
	}

	
	
}
