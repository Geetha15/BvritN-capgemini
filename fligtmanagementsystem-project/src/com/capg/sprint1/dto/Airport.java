package com.capg.sprint1.dto;
import java.util.Scanner;
public class Airport {

		static String airportName;
		static String airportCode;
		static String airportLocation;
		public static String getAirportName() 
		{
			return airportName;
		}
		public static void setAirportName(String airportName)
		{
			Airport.airportName = airportName;
		}
		public static String getAirportCode()
		{
			return airportCode;
		}
		public static void setAirportCode(String airportCode) 
		{
			Airport.airportCode = airportCode;
		}
		public static String getAirportLocation() 
		{
			return airportLocation;
		}
		public static void setAirportLocation(String airportLocation)
		{
			Airport.airportLocation = airportLocation;
		}

	}
