package com.capg.sprint1.dto;

import java.math.BigInteger;
import java.util.Date;

public class AddSchedule {
// long id;
// String sourceAirport;
// String destinationAirport;
// //double ticketCost;
// String departuretime;
// String arrivaltime;
// int capacity;
     BigInteger flightno;
	 String flightmodel;
	 String carriername;
	 int seatcapacity;
	 String airportName;
	 String airportCode;
	 String airportLocation;
	 String sourceAirport;
	 String destinationAirport;
	 Date arrivalTime;
	 Date departureTime;
	 
	 
	public AddSchedule() {
		super();
	
	}
	
	public AddSchedule(BigInteger flightno, String flightmodel, String carriername, int seatcapacity, String airportName,
			String airportCode, String airportLocation, String sourceAirport, String destinationAirport,
			Date arrivalTime, Date departureTime) {
		super();
		this.flightno = flightno;
		this.flightmodel = flightmodel;
		this.carriername = carriername;
		this.seatcapacity = seatcapacity;
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airportCode == null) ? 0 : airportCode.hashCode());
		result = prime * result + ((airportLocation == null) ? 0 : airportLocation.hashCode());
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((carriername == null) ? 0 : carriername.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationAirport == null) ? 0 : destinationAirport.hashCode());
		result = prime * result + ((flightmodel == null) ? 0 : flightmodel.hashCode());
		result = prime * result + ((flightno == null) ? 0 : flightno.hashCode());
		result = prime * result + seatcapacity;
		result = prime * result + ((sourceAirport == null) ? 0 : sourceAirport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddSchedule other = (AddSchedule) obj;
		if (airportCode == null) {
			if (other.airportCode != null)
				return false;
		} else if (!airportCode.equals(other.airportCode))
			return false;
		if (airportLocation == null) {
			if (other.airportLocation != null)
				return false;
		} else if (!airportLocation.equals(other.airportLocation))
			return false;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (carriername == null) {
			if (other.carriername != null)
				return false;
		} else if (!carriername.equals(other.carriername))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationAirport == null) {
			if (other.destinationAirport != null)
				return false;
		} else if (!destinationAirport.equals(other.destinationAirport))
			return false;
		if (flightmodel == null) {
			if (other.flightmodel != null)
				return false;
		} else if (!flightmodel.equals(other.flightmodel))
			return false;
		if (flightno == null) {
			if (other.flightno != null)
				return false;
		} else if (!flightno.equals(other.flightno))
			return false;
		if (seatcapacity != other.seatcapacity)
			return false;
		if (sourceAirport == null) {
			if (other.sourceAirport != null)
				return false;
		} else if (!sourceAirport.equals(other.sourceAirport))
			return false;
		return true;
	}

		public BigInteger getFlightno() {
		return flightno;
	}
	public void setFlightno(BigInteger flightno2) {
		this.flightno = flightno2;
	}
	public String getFlightmodel() {
		return flightmodel;
	}
	public void setFlightmodel(String flightmodel) {
		this.flightmodel = flightmodel;
	}
	public String getCarriername() {
		return carriername;
	}
	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}
	public int getSeatcapacity() {
		return seatcapacity;
	}
	public void setSeatcapacity(int seatcapacity) {
		this.seatcapacity = seatcapacity;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	
 
	}
 
 
