import java.io.File;

public class TwitterImage extends Image {

    public TwitterImage(File file) {
        this.targetWidth = 700;
        this.targetHeight = 400;
        this.isProg = true;
        this.converter = new JPGConverter();
        this.file = converter.convert(this);
    }

}