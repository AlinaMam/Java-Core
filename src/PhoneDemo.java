public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8067894532", "Acer", 7.8);
        Phone phone2 = new Phone("8895432230", "Samsung");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);

        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);

        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);

        phone1.receiveCall("Maма");
        phone2.receiveCall("Папа");
    }
}
