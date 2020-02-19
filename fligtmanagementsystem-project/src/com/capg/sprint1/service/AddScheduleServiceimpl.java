package com.capg.sprint1.service;

import com.capg.sprint1.dao.*;
import com.capg.sprint1.dto.*;
import java.math.BigInteger;
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;

	public class AddScheduleServiceimpl implements AddScheduleService {
		
		
		
		public BigInteger scheduleFlight(AddSchedule sf)
		{
			//AddScheduleDaoImpl sfDao=new AddScheduleDaoImpl();
			//BigInteger updatecount=sfDao.scheduleFlight(sf);
			AddScheduleDaoImpl sfDao=new AddScheduleDaoImpl();
			BigInteger updatecount=sfDao.scheduleFlight(sf);
			return updatecount;
		}
		
		
		/*public List<ScheduledFlight> viewScheduledFlights(Airport a,Airport a1,LocalDate ld)
		{
			
		}
		public Flight viewScheduledFlights(BigInteger b)
		{
			
		}
		public List<ScheduledFlight> viewScheduledFlight()
		{
			
		}
		public ScheduledFlight modifyScheduledFlight(Flight f,Schedule s1,Integer i)
		{
			
		}
		public void deleteScheduledFlight(BigInteger b1)
		{
			
		}
		public void validateScheduledFlight(ScheduledFlight sf2)
		{
			
		}*/
		

	}

	//public class AddScheduleServiceimpl implements AddScheduleService {
//	AddScheduleDao shceduledao=new AddScheduleDaoImpl();

	//@Override
//	public boolean addDetails(long id, String sourceAirport, String destinationAirport, String departuretime,
//			String arrivaltime, int capacity) {
//		
//		return shceduledao.addDetails(id, sourceAirport, destinationAirport, departuretime, arrivaltime,
//		 capacity);
//	}
//
////	@Override
//	public AddSchedule addFlightId(int id) {
//		
//		return shceduledao.addFlightIdInfo(id);
//	}

//	public boolean addDetails(long id, String sourceAirport, String destinationAirport, String departuretime, String arrivaltime,
//			int capacity) {
//		
//		return shceduledao.addDetails(id, String sourceAirport, String destinationAirport, String departuretime, String arrivaltime,
//				int capacity);
//	}
	//}

