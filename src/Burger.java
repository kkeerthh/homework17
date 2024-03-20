public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String herbs;
    public String mayo;

    public Burger(String bun, String meat, String cheese, String herbs, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayo = mayo;

        System.out.println("Звичайний бургер: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
        System.out.println("◇ Майонез: " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String herbs) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.herbs = herbs;

        System.out.println();
        System.out.println("Дієтичний бургер: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
    }

    public Burger(String bun, String doubleMeat, String meat, String cheese, String herbs, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.meat = doubleMeat;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayo = mayo;


        System.out.println();
        System.out.println("Бургер з подвійним м'ясом: ");
        System.out.println("◇ Булочка: " + bun);
        System.out.println("◇ М'ясо: " + doubleMeat + meat);
        System.out.println("◇ Сир: " + cheese);
        System.out.println("◇ Зелень: " + herbs);
        System.out.println("◇ Майонез: " + mayo);
    }
}
