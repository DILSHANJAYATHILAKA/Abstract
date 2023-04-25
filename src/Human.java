abstract class Human {

    Human(){
        System.out.println("Constructor is Running!");
    }

    abstract  void eat();
    abstract  void walk();
    void breathing(){
        System.out.println("Breathing");
    }
}

class Man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }
    void walk(){
        System.out.println("Any kind of walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab !!");
    }
}

class Dilshan extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Dilshan Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Foods!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}

class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Dilshan();
        Man m = new Dilshan();
        h.eat();
        h.walk();
        h.breathing();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.eat();
        m.walk();
        m.breathing();

    }
}
