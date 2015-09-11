
package Transporte;

public class Coordinates {
    private double latitude; //in decimal degrees.
    private double longitude; //in decimal degrees.

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

   public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

   public void setLatitude(double latitude) {
        this.latitude = latitude;
   }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}