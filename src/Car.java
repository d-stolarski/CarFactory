public class Car {

    private String brand;
    private int power;

    public Car(){}

    public Car(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Car))
            return false;
        Car other = (Car) obj;
        if(brand == null){
            if(other.brand != null)
                return false;
        } else if(!brand.equals(other.brand))
            return false;
        if (power != other.power)
            return false;
        return true;
    }



    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "Marka: " + brand + ", moc: " + power;
    }
}
