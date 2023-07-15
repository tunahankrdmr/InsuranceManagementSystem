public class Enterprise extends Account{

    private String companyName;

    public Enterprise(User user, String companyName) {
        super(user);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getUcret() * 1.1;
        insurance.setUcret(price);
        super.ınsurances.add(insurance);
    }
}
