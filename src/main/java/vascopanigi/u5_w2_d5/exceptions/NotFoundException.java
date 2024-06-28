package vascopanigi.u5_w2_d5.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID id) {
        super("Record with id: " + id + " not found!");
    }
}