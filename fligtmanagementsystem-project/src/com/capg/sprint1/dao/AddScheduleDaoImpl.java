package com.capg.sprint1.dao;

import java.math.BigInteger;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Date;
import com.capg.sprint1.dto.AddSchedule;

	
	public class AddScheduleDaoImpl implements AddScheduleDao {
		
		HashMap<BigInteger,AddSchedule> l=new HashMap<BigInteger,AddSchedule>(); 
		
		public BigInteger scheduleFlight(AddSchedule flight)
		{
			l.put(flight.getFlightno(),flight);
			BigInteger updatecount=flight.getFlightno();
			System.out.println(updatecount);
			System.out.println(l.containsKey(updatecount));
			System.out.println(l.get(updatecount));
			return updatecount;
		}

		
	
	}	
	

