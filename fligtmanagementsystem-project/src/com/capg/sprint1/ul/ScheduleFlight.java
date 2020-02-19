package com.capg.sprint1.ul;	
	import java.math.BigInteger;
	import java.text.SimpleDateFormat;
	import java.util.Date;
import java.util.Scanner;
import com.capg.sprint1.dao.AddScheduleDaoImpl;
import com.capg.sprint1.dto.*;
//import com.capg.sprint1.dto.Airport;
//import com.capg.sprint1.dto.Flight;
//import com.capg.sprint1.dto.Schedule;

	public class ScheduleFlight  {
		
		static Flight flight;
		static int availableSeats;
	    static BigInteger flightno;
		Schedule schedule;
		String airportLocation,airportName,airportCode,carriername, flightmodel,arrTime,depTime,sourceAirport,destinationAirport;
		int seatcapacity;
		public static void main(String[] args)throws Exception {
			
			 Scanner s = new Scanner(System.in); 
				Flight f=new Flight();
				Schedule sd=new Schedule();
				Airport a=new Airport();
				
				int ch;
				
//	while(ch1!=0)
				for(;;)
				{
				//	try {
					System.out.println("1.Add Schedule Flight");
					System.out.println("2.View flight between airports");
					System.out.println("3.View Flights with flight no");
					System.out.println("4.View all Flight details");
					System.out.println("5.Modify Scheduled flight");
					System.out.println("6.Delete Scheduled flight");
					System.out.println("Enter your choice");
					ch=s.nextInt();
					switch(ch)
					{		
					case 1:
						
						AddSchedule sf=new AddSchedule();//Dto
					
						System.out.println("Enter carrier name");
						String carriername=s.next()+s.nextLine();
						f.setCarrierName(carriername);
						sf.setCarriername(carriername);
						
						System.out.println("Enter flight no");
						flightno=s.nextBigInteger();
						f.setFlightNumber(flightno);
						sf.setFlightno(flightno);
					
						System.out.println("Enter flight model");
						String flightmodel=s.next()+s.nextLine();
						f.setFlightModel(flightmodel);
						sf.setFlightmodel(flightmodel);
						
						System.out.println("Enter seat capacity");
						int seatcapacity=s.nextInt();
						f.setSeatCapacity(seatcapacity);
						sf.setSeatcapacity(seatcapacity);
						
						System.out.println("Enter arrival time");
						String arrTime=s.next()+s.nextLine();
						Date arrivalTime=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(arrTime);
						sd.setArrivalTime(arrivalTime);
						sf.setArrivalTime(arrivalTime);
					
						System.out.println("Enter departure time");
						String depTime=s.next()+s.nextLine();				
						Date departureTime=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(depTime);
						//LocalTime departureTime=LocalTime.parse(depTime);
						//TemporalAccessor departureTime = DateTimeFormatter.ofPattern("dd/MM/YYYY").parse(depTime); 
						sd.setDepartureTime(departureTime);
						sf.setDepartureTime(departureTime);
						
						
//					System.out.println("Enter departure time");
//					String depTime=s.next();
//					System.out.println("Enter the source airport");
//					String sourceAirport=s.nextLine()+s.nextLine();
//					sd.setSourceAirport(sourceAirport);
//					sf.setSourceAirport(sourceAirport);
						
						System.out.println("Enter the destination airport");
						String destinationAirport=s.next()+s.nextLine();
						sd.setDestinationAirport(destinationAirport);
						sf.setDestinationAirport(destinationAirport);
						
						System.out.println("Enter the airport name ");
						String airportName = s.next()+s.nextLine();
						a.setAirportName(airportName);
						sf.setAirportName(airportName);
						
						System.out.println("Enter the airport code ");
						String airportCode = s.next()+s.nextLine();
						a.setAirportCode(airportCode);
						sf.setAirportCode(airportCode);
						
						System.out.println("Enter the airport location ");
						String airportLocation = s.next()+s.nextLine();
						a.setAirportLocation(airportLocation);
						sf.setAirportLocation(airportLocation);
						
						System.out.println("Enter available seats");
						availableSeats=s.nextInt();
						

						AddScheduleDaoImpl sfservice=new AddScheduleDaoImpl();
						
						BigInteger updatecount=sfservice.scheduleFlight(sf);
						System.out.println("Flight.no "+updatecount+" is added");
						//System.out.println(sf );
						
					break;
					/*
					case 2:
							System.out.println("Enter source airport ");
							 sourceAirport=s.next()+s.nextLine();
							 
							 System.out.println("Enter destination airport ");
							 destinationAirport=s.next()+s.nextLine();
							 break;
					case 3:
							System.out.println("Enter flight no to view the list of flights");
							flightno=s.nextBigInteger();
							break;
					case 4:	
							System.out.println("Enter flight no to view the details");
							flightno=s.nextBigInteger();
							break;
					case 5:
							System.out.println("Enter flight no in which modification is required");
							flightno=s.nextBigInteger();
							
							break;
					case 6:
							System.out.println("Enter flight no which should be deleted");
							flightno=s.nextBigInteger();
							break;
					case 7:*/
					
					default:
						
						
							 
					}	
				//	}
//				catch (Exception e) {
//					throw new Exception("invalid");
					}
			}
//			catch (Exception e) {
//
//			throw new Exception("invalid");
//				}
//			}			
//			
		}
		

//	}


