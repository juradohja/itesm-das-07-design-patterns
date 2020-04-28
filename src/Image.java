import javax.activation.MimeType;
import java.io.File;

public abstract class Image {

    protected int targetWidth;
    protected int targetHeight;
    protected boolean isProg;
    protected File file;
    protected Converter converter;

    public File getFile(){
        return file;
    }

}
