import java.util.Objects;

public class Processor {
    private double frequency;
    private int cores;
    private String manufacturer;

    public Processor(double frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency){
        this.frequency = frequency;
    }
    public int getCores() {
        return cores;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufactures=" + manufacturer + '\'' + '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return Objects.equals(processor.frequency, frequency) &&
                Objects.equals(processor.cores, cores) &&
                Objects.equals(processor.manufacturer, manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, cores, manufacturer);
    }
}
