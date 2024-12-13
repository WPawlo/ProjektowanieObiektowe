import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        BookDTO book1 = new BookDTO("Rozdroże krokow", "Andrzej Sapkowski", 59.99, 2024);
        BookDTO book2 = new BookDTO("Krew Elfow", "Andrzej Sapkowski", 29.99, 1994);
        BookDTO book3 = new BookDTO("Wieza Jaskolki", "Andrzej Sapkowski", 39.99, 1997);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Adress adress = new Adress("Andrzeja Sapkowskiego", "123", "00-000", "Sapkowskowo");
        Person person = new Person("Andrzej", "Sapkowski", adress);

        System.out.println(person);

        Car car = new Car("Volkswagen", "Passat", 7.3);

        double fuelPrice = 7.20;
        double distance = 230;
        double cost =  car.fuelCost(fuelPrice, distance);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        String number1Formatted = numberFormat.format(cost);

        System.out.println(number1Formatted + "PLN");

        Person2 person2 = new Person2("Anrzdrzejka", 25);

        System.out.println(person2);

        BankAccount account1 = new BankAccount("123456789");
        System.out.println(account1.accountNumber() + " balans: " + account1.balance());

        MusicAlbum album1 = new MusicAlbum("Album1", "Sapkowski");
        album1.addRatings(4.5);
        album1.addRatings(3.8);
        album1.removeRatings(3.8);

        System.out.println(album1);

        RockAlbum rockAlbum = new RockAlbum("RockAlbum", "Sapkowski", "Ciężki Sapkowski");
        rockAlbum.addRatings(3.0);
        rockAlbum.addRatings(3.8);
        rockAlbum.setRockGenre("Nie ciężki Sapkowski");

        System.out.println(rockAlbum);
    }
}