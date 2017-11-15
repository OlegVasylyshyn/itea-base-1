package week4;

public enum MobileBrands {

    SONY_ERICSON("Some not bad mobile phones"),
    NOKIA("Has bad windows phone operation system"),
    APPLE("Very expensive"),
    SIEMENS("Very old"),
    MEIZU("Chine mobile"),
    DEFAULT("Not set");

    private String description;

    MobileBrands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static MobileBrands getBrand(String brandString) {
        MobileBrands[] brands = MobileBrands.values();
        for(MobileBrands brand : brands) {
            if(brand.name().equals(brandString)) {
                return brand;
            }
        }
        return DEFAULT;
    }

}
