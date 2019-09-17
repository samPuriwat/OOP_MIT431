package Lab7;

public class SuperCar {

    private String carBrand;
    private String color;
    private String engineSize;
    private String originCountry;

    //constructors

    public SuperCar() {
    }

    public SuperCar(String carBrand, String color, String engineSize, String originCountry) {
        this.carBrand = carBrand;
        this.color = color;
        this.engineSize = engineSize;
        this.originCountry = originCountry;
    }

    //getter and setter

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }


    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
