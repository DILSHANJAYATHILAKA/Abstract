abstract public class Bike {
    abstract void ride();
}

class YamahaFZ extends Bike{
    @Override
    void ride() {
        System.out.println("Ride Safely!");
    }

    public static void main(String[] args) {
        Bike b = new YamahaFZ();
        b.ride();
    }
}
