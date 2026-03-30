package oop_projects.metro_network_simulator;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private final String identifier;
    private List<Station> stations = new ArrayList<>();

    public Line(String id, List<Station> stations) {
        this.identifier = id;

        if (stations.size() >= 2) {
            this.stations = stations;
        }
        for (Station station : stations) {
            setupStations(this, station);
        }
    }

    public List<Station> getStations() {
        return stations;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void addStation(Station station){
        if(!this.stations.contains(station)){
        this.stations.add(station);
        }
    }

    private void setupStations(Line line, Station station) {
        station.addLine(line);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.identifier);
        return sb.toString();
    }
}
