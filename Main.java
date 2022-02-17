class Main{
    public static void main (String[] args){
        // System.out.println("Hello world");
        Robber Jackie = new Robber("Jackie",25,1000.34);
        Robber Luffy = new Robber("Luffy", 20, 100000.33);
        Jackie.robbingTime();
        System.out.println(Jackie.name+Jackie.age+Jackie.money);
        Luffy.robbingTime();
        System.out.println(Luffy.name+Luffy.age+Luffy.money);

    }
}

class Robber{
    double money;
    String name;
    int age;

    Robber(String name, int age, double money){
        this.name = name;
        this.age = age;
        this.money = money;
    }

    void robbingTime(){
        System.out.println("At the age of "+ age);
    }
}