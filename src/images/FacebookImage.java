package images;

import images.converters.JPEGConverter;
import java.io.File;

public class FacebookImage extends Image {

    public FacebookImage(File file) {
        this.targetWidth = 500;
        this.targetHeight = 300;
        this.isProg = false;
        this.converter = new JPEGConverter();
        this.file = converter.convert(this);
    }

}
