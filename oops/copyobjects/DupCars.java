public class DupCars {

    private String maker;
    private String model;
    private int year;


    @SuppressWarnings("OverridableMethodCallInConstructor")
    DupCars(String maker, String model, int year) {
        this.setMaker(maker);
        this.setModel(model);
        this.setYear(year);
    }

    // Copy constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    DupCars(DupCars x) {
        this.copy(x);
    }

    // Getter for maker
    public String getMaker() {
        return maker;
    }


    public String getModel() {
        return model;
    }

   
    public int getYear() {
        return year;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Copy method
    public void copy(DupCars x) {
        this.setMaker(x.getMaker());
        this.setYear(x.getYear());
        this.setModel(x.getModel());
    }
}
