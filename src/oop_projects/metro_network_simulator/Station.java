package oop_projects.metro_network_simulator;

import java.util.HashSet;
import java.util.Set;

public class Station {

    private String name;
    private Set<Line> lines = new HashSet<>();

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public Set<Line> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        return sb.toString();
    }
}
