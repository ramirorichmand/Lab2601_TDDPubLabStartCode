public class Guest {
    private int age;
    private double money;
    private int sobriety;
    private boolean banned;

    private String name;
    private char currency;

    public Guest(int age, double money, int sobriety, boolean banned, char currency) {
        this.age = age;
        this.name = name;
        this.money = money;
        this.sobriety = sobriety;
        this.banned = banned;
        this.currency = currency;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public int getSobriety() {
        return sobriety;
    }

    public boolean isBanned() {
        return banned;
    }

    public char getCurrency() {
        return currency;
    }
}
