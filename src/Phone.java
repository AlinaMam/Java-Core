public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    String getNumber() {
        return number;
    }

    public static void main(String[] args) {

    }
}