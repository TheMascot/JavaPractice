package oop_projects.ironhold.buildings;

public abstract class ProductionBuilding extends Building {

    private int maxWorkerNumber;

    public int getMaxWorkerNumber() {
        return maxWorkerNumber;
    }

    public void setMaxWorkerNumber(int maxWorkerNumber) {
        this.maxWorkerNumber = maxWorkerNumber;
    }
}
