public class CourseDetails implements Course {
    public String duration;
    private PriceCalc priceCalc;

    CourseDetails() {
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String getProgrammeName() {
        return "Full-Stack";
    }

    @Override
    public String getPrice() {
        return priceCalc.showPrice();
    }

    public void setPriceCalc(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    public void start() {
        System.out.println("Started");
    }

    public void destroy() {
        System.out.println("Destroyed");
    }
}
