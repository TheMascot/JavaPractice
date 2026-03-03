package JFD.Nine;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AirplaneFlightWithDuration extends AirplaneFlight{

    public AirplaneFlightWithDuration(int flightNumber, AirportCode depAirport, AirportCode arrAirport) {
        super(flightNumber, depAirport, arrAirport);
    }

    public AirplaneFlightWithDuration(int flightNumber, AirportCode depAirport, AirportCode arrAirport, LocalTime depTime, LocalTime arrTime) {
        super(flightNumber, depAirport, arrAirport, depTime, arrTime);
    }

    public String duration(){
        long hours = ChronoUnit.HOURS.between(this.getDepTime(), this.getArrTime());
        long minutes = ChronoUnit.MINUTES.between(this.getDepTime(), this.getArrTime());

        return "Duration of the flight: " + hours + " hours " + (minutes - hours * 60) + " minutes";
    };

}
