package week4;

import java.util.Arrays;

public final class NuclearStation {

    public final static String COMPANY = "Nuclear inc";

    private final int powerCoefficient;
    private final String name;
    private final String reactorType;
    private final String address;
    private final String generalDirector;
    private final Employee[] employees = new Employee[] {new Employee("Petro")};

    public NuclearStation(int powerCoefficient, String name, String reactorType, String address, String generalDirector) {
        this.powerCoefficient = powerCoefficient;
        this.name = name;
        this.reactorType = reactorType;
        this.address = address;
        this.generalDirector = generalDirector;
    }

    public NuclearStation(NuclearStation oldStation) {
        this.powerCoefficient = oldStation.powerCoefficient;
        this.name = oldStation.name;
        this.reactorType = oldStation.reactorType;
        this.address = oldStation.address;
        this.generalDirector = oldStation.generalDirector;
    }

    public int getPowerCoefficient() {
        return powerCoefficient;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees(){
        return employees.clone();
    }

    public final void work(){
        System.out.println("WORK");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NuclearStation{");
        sb.append("powerCoefficient=").append(powerCoefficient);
        sb.append(", name='").append(name).append('\'');
        sb.append(", reactorType='").append(reactorType).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", generalDirector='").append(generalDirector).append('\'');
        sb.append(", employees=").append(Arrays.toString(employees));
        sb.append('}');
        return sb.toString();
    }


    public static class NuclearStationBuilder {

        private int powerCoefficient = 1;
        private String name;
        private String reactorType;
        private String address;
        private String generalDirector;

        public NuclearStationBuilder() {
        }

        public NuclearStationBuilder setPowerCoefficient(int powerCoefficient) {
            this.powerCoefficient = powerCoefficient;
            return this;
        }

        public NuclearStationBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public NuclearStationBuilder setReactorType(String reactorType) {
            this.reactorType = reactorType;
            return this;
        }

        public NuclearStationBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public NuclearStationBuilder setGeneralDirector(String generalDirector) {
            this.generalDirector = generalDirector;
            return this;
        }

        public NuclearStation build(){
            return new NuclearStation(powerCoefficient, name, reactorType, address, generalDirector);
        }

    }



    private class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Employee{");
            sb.append("name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
