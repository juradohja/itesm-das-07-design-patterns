import java.io.File;
import java.util.List;

public class MemeMaker {

    private static MemeMaker memeMaker;
    private boolean isFinished;
    private Client client;

    private MemeMaker() {
    }

    public static MemeMaker getInstance(){
        if(memeMaker == null){
            memeMaker = new MemeMaker();
        }
        return memeMaker;
    }

    public void generate(List<File> fileList) {
        setFinished(false);
        for(File file : fileList){
            new FacebookImage(file);
            new InstagramImage(file);
            new TwitterImage(file);
            new PageImage(file);
        }
        setFinished(true);
    }

    public void attach(Client client){
        this.client = client;
    }

    private void setFinished(boolean state){
        this.isFinished = state;
        notifyObserver();
    }

    private void notifyObserver(){
        client.updateStatus();
    }

    public boolean hasFinished(){
        return this.isFinished;
    }

}
