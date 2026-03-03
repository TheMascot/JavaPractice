package JFD.Nine;

import java.time.LocalTime;

public class useAirplaneFlight {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(17, 20);
        LocalTime t2 = LocalTime.now();

        AirplaneFlight f1 = new AirplaneFlight(1234, AirportCode.LHBP, AirportCode.ESOE);
        AirplaneFlight f2 = new AirplaneFlight(7856, AirportCode.ORBI, AirportCode.LHPA, t2, t1);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        AirplaneFlightWithDuration f3 = new AirplaneFlightWithDuration(7856, AirportCode.ORBI, AirportCode.LHPA, t2, t1);
        System.out.println(f3.duration());
    }
}
