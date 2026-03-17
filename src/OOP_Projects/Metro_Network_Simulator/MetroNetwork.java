package OOP_Projects.Metro_Network_Simulator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetroNetwork {

    private Map<Line, List<Station>> lineNetwork = new HashMap<>();
    private Map<Station, Set<Line>> stationsToLines = new HashMap<>();

    public void addNewLine(Line line){
        lineNetwork.putIfAbsent(line, line.getStations());
        createStationsToLines(this.lineNetwork, line);
    }

    public void removeLine(Line line){
        lineNetwork.remove(line);
    }

    private void createStationsToLines(Map<Line, List<Station>> lineNetwork, Line line){
        for(Station station : lineNetwork.get(line)){
            stationsToLines.putIfAbsent(station, station.getLines());
        }
    }

    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
       for(Line line : lineNetwork.keySet()){
           sb.append("Line: ").append(line).append("\nStations: ");
           for (Station station : lineNetwork.get(line)) {
               sb.append(station).append(", ");
           }
           sb.append("\n");
       }
       return sb.toString();
    }

}
