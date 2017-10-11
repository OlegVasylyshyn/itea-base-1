package week5.object;

public class Car implements Cloneable {

    private final String brand;
    private final String model;
    private final Engine engine;

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        engine = car.engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String toString() {
        return String.format("Car : brand - %s, model - %s, engine - %s", brand, model, engine);
    }

    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    protected void finalize() throws Throwable {
        System.out.println("Bye !!! ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || !(o instanceof Car)) return false;

        Car car = (Car) o;

        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    /**
     * @see java.lang.Object
     */
    public int hashCode() {
        int result = 0;
        result += 31 * (model == null ? 0 : model.hashCode());
        result += 31 * (brand == null ? 0 : brand.hashCode());
        result += 31 * (engine == null ? 0 : engine.hashCode());
        return result;
    }

}

final class Engine implements Cloneable {

    private String model;
    private String brand;

    public Engine(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj == this) return true;

        if (obj.getClass() != this.getClass()) return false;

        Engine engine = (Engine) obj;

        if (!model.equals(engine.model)) return false;
        if (!brand.equals(engine.brand)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("model='").append(model).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
