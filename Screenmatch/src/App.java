import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class App {
    public static void main(String[] args) throws Exception {

        List<Account>  list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
        list.add(new SavingsAccount(1003, "Bide", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Hugo", 500.00, 500.0));

        double soma = 0.0;
        for (Account account : list) {
            soma += account.getBalance();
        }

        System.out.printf("Total balance R$: %.2f%n", soma);

        for (Account account : list) {
            account.deposit(10.00);
        }
        for (Account acc : list) {
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
