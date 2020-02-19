package com.capg.sprint1.dao;

import com.capg.sprint1.dto.AddSchedule;
	import java.math.BigInteger;
	//import java.util.Date;
	import java.util.List;

	public interface AddScheduleDao { 
		
		List<AddSchedule> scheduledFlightDao=null;
		
		BigInteger scheduleFlight(AddSchedule flight);
		/*List<ScheduledFlight> viewScheduledFlights(Airport source,Airport destination, Date dateTime);
		Flight viewScheduledFlights(BigInteger flightId);
		List<ScheduledFlight> viewScheduledFlight();
		ScheduledFlight modifyScheduledFlight(Flight flight,Schedule schedule,int a);
		void deleteScheduledFlight(BigInteger flightno);
		*/
		

//	public boolean addFlightInfo(AddSchedule data);
// public AddSchedule addFlightIdInfo(int id);
// public boolean updateFlightdata(AddSchedule data);
//public boolean addDetails(String source, String destination, String departuretime, String arrivaltime);

//public boolean addDetails(long id, String sourceAirport, String destinationAirport, String departuretime, String arrivaltime,
	//	int capacity);
 
}
