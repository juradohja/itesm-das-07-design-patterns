package images.converters;

import images.Image;
import java.io.File;

public interface Converter {

    File convert(Image image);

}
