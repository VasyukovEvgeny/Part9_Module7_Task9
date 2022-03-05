class Accounter {
    private String name;
    public Accounter(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Accounter:  " + name;
    }
}