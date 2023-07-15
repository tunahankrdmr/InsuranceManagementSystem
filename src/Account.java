import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
    private User user;
    private AuthenticationStatus authenticationStatus;
    protected ArrayList<Insurance> ınsurances;

    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Account(User user) {
        this.user = user;
        this.authenticationStatus=authenticationStatus;
        this.ınsurances=ınsurances;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public ArrayList<Insurance> getInsurances() {
        return ınsurances;
    }

    public void setInsurances(ArrayList<Insurance> ınsurances) {
        this.ınsurances = ınsurances;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void login(String email, String password) throws InvalidAuthenticationException{
        if (user.getEmail().equals(email) && user.getSifre().equals(password)){
            this.authenticationStatus=authenticationStatus.SUCCESS;
        }else{
            throw new InvalidAuthenticationException("Invalid account");
        }

    }

    public void addAdress(Adress adress){
        if (this.authenticationStatus==authenticationStatus.SUCCESS){
            user.addAdress(adress);
        }
    }

    public void removeAdress(Adress adress){
        if (this.authenticationStatus==authenticationStatus.SUCCESS){
            user.removeAdress(adress);
        }
    }

    public abstract void addInsurance(Insurance insurance);

    public final void showUserInfo(){
        System.out.println("Name : " + this.user.getIsim());
        System.out.println("Surname : " + this.user.getSoyIsim());
        System.out.println("Email : " + this.user.getEmail());
        System.out.println("Password : " + this.user.getSifre());
        System.out.println("Age: " + this.user.getYas());
        System.out.println("Last login date: " + this.user.getSonGirisTarihi());
        for (Adress i : user.getAdres()){
            System.out.println(i);
        }
    }

    @Override
    public int compareTo(Account other) {
        // you can compare accounts based on the email
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        // you can use the email as the basis for the hash code
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        // you can check if two accounts are equal based on the email
        return this.user.getEmail().equals(other.user.getEmail());
    }

}
