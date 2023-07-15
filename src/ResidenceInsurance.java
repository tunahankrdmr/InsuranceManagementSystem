import java.time.LocalDate;

public class ResidenceInsurance extends Insurance{

    private double buildingValue;
    private double contentValue;

    public ResidenceInsurance(double buildingValue, double contentValue) {
        super("Residence Insurance", 980, LocalDate.now(), LocalDate.now().plusMonths(4));
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }

    @Override
    public void calculate() {
        double basePrice = getUcret();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();
        double premium = basePrice + (buildingValue * 0.002) + (contentValue * 0.001);
        setUcret(premium);
    }

    @Override
    public String toString() {
        return "ResidenceInsurance [name=" + getIsim() + ", price=" + getUcret() + ", startDate=" + getBaslangıc()
                + ", endDate=" + getBitis() + ", buildingValue=" + buildingValue + ", contentValue=" + contentValue
                + "]";
    }
}
