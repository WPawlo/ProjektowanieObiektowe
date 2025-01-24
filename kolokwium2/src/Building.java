class Building {
    double height;
    String color;

    public Building(double height, String color){
        this.height = height;
        this.color = color;
    }
}

class House extends Building{
    private int numberOfRooms;

    public House(double height, String color, int numberOfRooms){
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }
}
