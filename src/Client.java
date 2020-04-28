import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Client {

    private MemeMaker memeMaker;

    public Client(){
        this.memeMaker = MemeMaker.getInstance();
        this.memeMaker.attach(this);
    }

    public void updateStatus(){
        if(memeMaker.hasFinished()){
            System.out.println("Done");
        } else {
            System.out.println("Pending");
        }
    }

    public static void main(String[] args){

        Client client = new Client();
        List<File> fileList = new ArrayList<>();
        // AGREGAR IMÁGENES
        client.memeMaker.generate(fileList);
    }

}
