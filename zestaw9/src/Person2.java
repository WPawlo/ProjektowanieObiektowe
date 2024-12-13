public record Person2(String name, int age) {
    public Person2 {
        if (age < 0) {
            System.out.println("Wiek nie moze byc ujemny.");
            age = 0;
        }
    }
}
