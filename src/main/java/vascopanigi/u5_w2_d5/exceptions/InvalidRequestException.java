package vascopanigi.u5_w2_d5.exceptions;

import lombok.Getter;
import org.springframework.validation.ObjectError;

import java.util.List;

@Getter
public class InvalidRequestException extends RuntimeException {
    private List<ObjectError> errorList;

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(List<ObjectError> errorList) {
        super("There were errors with payload validation.");
        this.errorList = errorList;
    }
}
