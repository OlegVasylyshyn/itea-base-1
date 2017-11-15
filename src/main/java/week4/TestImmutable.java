package week4;

import static week4.NuclearStation.NuclearStationBuilder;

public class TestImmutable {

    public static void main(String[] args) {

        final NuclearStation station = new NuclearStation(10, "station", "SIEMENS", "New York, MainStreet, 25", "Mr.Smith");

        // if I want new station I must create new because of immutable
        NuclearStation newNuclearStation = new NuclearStation(1, "new station", "MADE IN CHINA", "Moskow, Red square", "Putin");

        // or I can use all copy methods.. for example Copy Constructor
        NuclearStation copied = new NuclearStation(station);

        runNuclearStation(station);

        System.out.println(station);
        // safe employees.. no one will be fired
        station.getEmployees()[0] = null;
        int powerCoefficient = station.getPowerCoefficient();
        powerCoefficient = 50;
        System.out.println(station);

        // Illegal
//        NuclearStation.COMPANY = "Another inc";
        System.out.println("All created nuclear station from company : " + NuclearStation.COMPANY);


        // read resource
        // right method
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append("new line").append(" ");
        }
        System.out.println(stringBuilder);

        // wrong method
//        String text = "";
//        for (int i = 0; i < 100_000; i++) {
//            text += "new line";
//        }
//        System.out.println(text);



        // Using our builder
        NuclearStationBuilder builder = new NuclearStationBuilder();

        // creating immutable station via mutable builder
        NuclearStation spainStation = builder
                .setAddress("Madrid, Central street 25")
                .setName("Spain NS")
                .setPowerCoefficient(7)
                .setGeneralDirector("Amigo")
                .setReactorType("Mechanic").build();

        System.out.println(spainStation);



        // Using singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        System.out.println(singleton == singleton2);


        // Using enums
        MobileBrands nokia = MobileBrands.NOKIA;
        MobileBrands siemens = MobileBrands.SIEMENS;

        System.out.println("Name of mobile brand " + nokia.name());
        System.out.println("Ordinal number of " + nokia.name() + " brand : " + nokia.ordinal());

        System.out.println("All brands ");
        MobileBrands[] brands = MobileBrands.values();
        for (MobileBrands brand: brands) {
            System.out.println("Name of mobile brand " + brand.name());
            System.out.println("Ordinal number of " + brand.name() + " brand : " + brand.ordinal());
            System.out.println("Description : " + brand.getDescription());
        }

        // Creating enums
        System.out.println("Create enum");
        MobileBrands meizu = MobileBrands.valueOf("MEIZU");
        System.out.println(meizu);
        // Enums can be comparing by operator `==`
        System.out.println(meizu == MobileBrands.MEIZU);


        MobileBrands meizu1 = MobileBrands.getBrand("sfsdghgsdg");
        System.out.println(meizu1);

    }


    private static void runNuclearStation(NuclearStation nuclearStation){
        nuclearStation.work();
    }

}
