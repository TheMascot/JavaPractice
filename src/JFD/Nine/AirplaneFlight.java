package JFD.Nine;

import java.time.LocalTime;

public class AirplaneFlight {

    private int flightNumber;
    private AirportCode depAirport;
    private AirportCode arrAirport;
    private LocalTime depTime;
    private LocalTime arrTime;


    public AirplaneFlight(int flightNumber, AirportCode depAirport, AirportCode arrAirport){
        this.flightNumber = flightNumber;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
    }

    public AirplaneFlight(int flightNumber, AirportCode depAirport, AirportCode arrAirport, LocalTime depTime,
                          LocalTime arrTime){
        this(flightNumber, depAirport, arrAirport);
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    public LocalTime getDepTime() {
        return depTime;
    }

    public LocalTime getArrTime() {
        return arrTime;
    }

    @Override
    public String toString() {
        return "AirplaneFlight{" +
                "flightNumber=" + flightNumber +
                ", depAirport=" + depAirport +
                ", arrAirport=" + arrAirport +
                ", depTime=" + depTime +
                ", arrTime=" + arrTime +
                '}';
    }
}
