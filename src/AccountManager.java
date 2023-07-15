import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountTreeSet;

    public AccountManager() {
        this.accountTreeSet=new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountTreeSet.add(account);
    }

    public void removeAccount(Account account) {
        accountTreeSet.remove(account);
    }

    public Account login(String email, String password) {
        for (Account account : accountTreeSet) {
            try {
                account.login(email, password);
                if (account.getAuthenticationStatus() == Account.AuthenticationStatus.SUCCESS) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public TreeSet<Account> getAccountTreeSet() {
        return accountTreeSet;
    }
}
