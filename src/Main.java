import facade.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File file = converter.convertVideo("youtubevideon.ogg", "mp4");
    }
}
/*
 * Facade pattern:
 * is used to encapsulate complex related operations and simplify their access.
 * Consists of 3 main actors:
 *   1. Client: Need to access some functionality from an API.
 *   2. Facade: Encapsulate API complex functions
 *   3. Subsystems/API
 * Facade class have references to subsystems class to delegate work to them
 * */