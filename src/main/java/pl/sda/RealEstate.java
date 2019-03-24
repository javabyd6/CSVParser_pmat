package pl.sda;

/**
 * @author pmatusiak
 */
public class RealEstate {

    private String street;
    private String city;
    private int zip;
    private String state;
    private int beds;
    private int baths;
    private int sq_ft;
    private String type;
    private String sale_date;
    private int price;

    public String getCity() {
        return city;
    }

    private double latitude;
    private double longitude;

    public RealEstate(String street, String city, int zip, String state, int beds, int baths, int sq_ft, String type, String sale_date, int price, double latitude, double longitude) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sq_ft = sq_ft;
        this.type = type;
        this.sale_date = sale_date;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public void setSq_ft(int sq_ft) {
        this.sq_ft = sq_ft;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sq_ft=" + sq_ft +
                ", type='" + type + '\'' +
                ", sale_date='" + sale_date + '\'' +
                ", price=" + price +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
