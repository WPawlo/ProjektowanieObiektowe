public class Main {
    public static void main(String[] args) {
        House house = new House(12.3, "Niebieski", 6);

        Bitmap bitmap = new Bitmap(3, 2, "plik1");

        Vector vector = new Vector(2, 3 ,"plik2");

        bitmap.loadFile();
        bitmap.saveFile();
        vector.loadFile();
        vector.saveFile();

        MediaPlayer.AudioPlayer audioplayer = new MediaPlayer.AudioPlayer();
        audioplayer.play("Imagine Dragons - Warriors");
        audioplayer.pause();
        System.out.println(audioplayer.getCurrentTrack());
        MediaPlayer.VideoPlayer videoplayer = new MediaPlayer.VideoPlayer();
        videoplayer.play("Król Lew");
        videoplayer.pause();
        System.out.println(videoplayer.getCurrentTrack());
        }
    }