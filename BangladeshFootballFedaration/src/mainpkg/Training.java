
package mainpkg;



import java.io.Serializable;

public class Training implements Serializable {
    private String Training;

    public String getTraining() {
        return Training;
    }

    public void setTraining(String Training) {
        this.Training = Training;
    }

    public Training(String Training) {
        this.Training = Training;
    }

    @Override
    public String toString() {
        return "Training{" + "Training=" + Training + '}';
    }

    
    
    
}
