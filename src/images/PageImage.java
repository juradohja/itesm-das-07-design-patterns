package images;

import images.converters.PNGConverter;
import java.io.File;

public class PageImage extends Image {

    public PageImage(File file) {
        this.targetWidth = 700;
        this.targetHeight = 400;
        this.isProg = false;
        this.converter = new PNGConverter();
        this.file = converter.convert(this);
    }

}