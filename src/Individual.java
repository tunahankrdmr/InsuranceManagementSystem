public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getUcret() * 1.05;
        insurance.setUcret(price);
        super.ınsurances.add(insurance);
    }
}
