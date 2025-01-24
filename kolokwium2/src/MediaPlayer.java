interface MediaPlayer {
    void play(String trackName);
    void pause();
    String getCurrentTrack();

    class AudioPlayer implements MediaPlayer{
        private String CurrentTrack;

        @Override
        public void play(String trackName){
            CurrentTrack = trackName;
            System.out.println("Play: " + CurrentTrack);
        }
        public void pause(){
            System.out.println("Pauza");
        }
        public String getCurrentTrack(){
            return CurrentTrack;
        }
    }
    class VideoPlayer implements MediaPlayer{
        private String CurrentTrack;

        @Override
        public void play(String trackName){
            CurrentTrack = trackName;
            System.out.println("Play: " + CurrentTrack);
        }
        public void pause(){
            System.out.println("Pauza");
        }
        public String getCurrentTrack(){
            return CurrentTrack;
        }
    }
}
