import java.time.LocalDate;
import java.util.List;

public class TravelInsurance extends Insurance{

    private List<String> coveredCountries;
    private int duration;


    public TravelInsurance(List<String> coveredCountries, int duration) {
        super("Travel Insurance", 1200, LocalDate.now(), LocalDate.now().plusYears(1));
        this.coveredCountries = coveredCountries;
        this.duration = duration;
    }

    public List<String> getCoveredCountries() {
        return coveredCountries;
    }

    public void setCoveredCountries(List<String> coveredCountries) {
        this.coveredCountries = coveredCountries;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void calculate() {
        double basePrice = getUcret();
        int duration = getDuration();
        int numberOfCountries = getCoveredCountries().size();
        double premium = basePrice + (basePrice * 0.1 * duration) + (basePrice * 0.05 * numberOfCountries);
        setUcret(premium);
    }

    @Override
    public String toString() {
        return "TravelInsurance [name=" + getIsim() + ", price=" + getUcret() + ", startDate=" + getBaslangıc()
                + ", endDate=" + getBitis()
                + ", coveredCountries=" + coveredCountries + ", duration=" + duration + "]";
    }
}
