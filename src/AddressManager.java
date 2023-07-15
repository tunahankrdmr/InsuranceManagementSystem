import java.util.List;

public class AddressManager {
    private User user;

    public static void addAdress(User user, Adress adres){
        user.getAdres().add(adres);
    }

    public static void removeAdress(User user, Adress adres){
        user.getAdres().remove(adres);
    }
}
