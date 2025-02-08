package com.TKA.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TKA.dao.WcwoldcupDao;
import com.TKA.entity.WcWorldcup;

@Service
public class WcWorldcupService {
	
	@Autowired
	WcwoldcupDao dao;
	
	public int allIndianCricketStaffCount()
	{
		System.out.println("I am in service");
		List<WcWorldcup> stafflist = dao.allIndianCricketStaffList();
		return stafflist.size();
	}
	
	public int allIndianCricketMedStaffCount(String deptName)
	{
		List<WcWorldcup> stafflist = dao.allIndianCricketStaffList();
		ArrayList<WcWorldcup> alnewStaff = new ArrayList<WcWorldcup>();
		
		for(WcWorldcup wlist :stafflist)
		{
			if(wlist.getStaffDept().equalsIgnoreCase(deptName))
			{
				alnewStaff.add(wlist);
			}
		}
		return alnewStaff.size();
	}

	public HashMap<String,Integer> fetchIndianCricketNamewithAge()
	{
		List<WcWorldcup> stafflist = dao.allIndianCricketStaffList();
		HashMap<String,Integer> agenameMap = new HashMap<String, Integer>();
		for(WcWorldcup wlist : stafflist)
		{
			agenameMap.put(wlist.getStaffName(), wlist.getAge());
		}
		return agenameMap;
	}
	
	public WcWorldcup fetchMostwork()
	{
		List<WcWorldcup> stafflist = dao.allIndianCricketStaffList();
		//ArrayList<WcWorldcup> newlist = new ArrayList<WcWorldcup>();
		WcWorldcup w = new WcWorldcup();
		int max=0;
		for(WcWorldcup wlist : stafflist)
		{
			if(max < wlist.getNoofYeartoBcci())
			{
				 w = wlist;
				 max = wlist.getNoofYeartoBcci();
				//newlist.add(wlist);
			}
		}
		return w;
		}
	

public void insertCricketStaff(WcWorldcup w)
{
	dao.insertCricketStaff(w);
}

public void updateCricketStaff(WcWorldcup w) {
	dao.updateCricketStaff(w);
	
}

public void deleteCricketStaff(int id) {
	dao.deleteCricketStaff(id);
	
}

 
}

