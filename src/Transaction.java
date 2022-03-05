class Transaction<T extends Accountable>{
    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода
    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){
        from.setSum(from.getSum() - sum);
        to.setSum(to.getSum() + sum);
        System.out.printf("Account %s Balance TO BE: %d \nAccount %s Balance TO BE: %d \n", from.getId(), from.getSum(),to.getId(), to.getSum());
    }
}