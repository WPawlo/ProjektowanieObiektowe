abstract class ComputerGraphic {
    int width;
    int height;
    String fileName;

    public ComputerGraphic(int width, int height, String fileName){
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public abstract void loadFile();
    public abstract void saveFile();
}

class Vector extends ComputerGraphic {
    public Vector(int width, int height, String fileName){
        super(width, height, fileName);
    }

    @Override
    public void loadFile(){
        System.out.println("Ładowanie pliku: " + fileName);
    }

    public void saveFile(){
        System.out.println("Zapisywanie pliku: " + fileName);
    }
}

class Bitmap extends ComputerGraphic {
    public Bitmap(int width, int height, String fileName){
        super(width, height, fileName);
    }

    @Override
    public void loadFile(){
        System.out.println("Ładowanie pliku: " + fileName);
    }

    public void saveFile(){
        System.out.println("Zapisywanie pliku: " + fileName);
    }
}