package JFD;

public class PlaceToLive {

    String address;
    int numberOfBedrooms;
    int totalArea;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    public void displayPlace(){
        System.out.println("Address: " + this.address);
        System.out.println("Number of bedrooms: " + numberOfBedrooms);
        System.out.println("Total area: " + totalArea + " square meters");
    }

}
