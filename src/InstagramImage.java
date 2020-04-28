import java.io.File;

public class InstagramImage extends Image {

    public InstagramImage(File file) {
        this.targetWidth = 200;
        this.targetHeight = 300;
        this.isProg = true;
        this.converter = new JPEGConverter();
        this.file = converter.convert(this);
    }

}