public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String herbs;
    public boolean mayo;


    public Burger() {
        this.bun = "бріош";
        this.meat = "яловичина";
        this.cheese = "пармезан";
        this.herbs = "салат";
        this.mayo = true;

        System.out.println("Звичайний бургер: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
        System.out.println("◇ Майонез: " + (mayo ? "з майонезом" : "без майонеза"));
    }

    public Burger(boolean withoutMeat) {
        this.bun = "бріош";
        this.meat = "яловичина";
        this.cheese = "брі";
        this.herbs = "помідор";
        this.mayo = !withoutMeat;

        System.out.println();
        System.out.println("Дієтичний бургер: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
        System.out.println("◇ Майонез: " + (mayo ? "з майонезом" : "без майонеза"));
    }

    public Burger(String doubleMeat) {
        this.bun = "бріош";
        this.meat = doubleMeat;
        this.cheese = "чедер";
        this.herbs = "салат";
        this.mayo = true;

        System.out.println();
        System.out.println("Бургер з подвійним м'ясом: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
        System.out.println("◇ Майонез: " + (mayo ? "з майонезом" : "без майонеза"));
    }
}




