public class Main{
    public static void main(String[] args) {
        Account acc1 = new Account("1", 5000);
        Account acc2 = new Account("2", 4300);
        Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, 1560);
        System.out.printf("Account 1 Balance AS IS: %d \n", acc1.getSum());
        System.out.printf("Account 2 Balance AS IS: %d \n", acc2.getSum());
        System.out.printf("Summa perevoda: 1560 \n");
        tran1.execute();
        Accounter tom = new Accounter("Tom");
        System.out.println(tom.toString());
    }
}