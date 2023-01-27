package pojos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class GenericResponse {
    private String code;
    private String type;
    private String message;

    public GenericResponse(){}

    public GenericResponse(String code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }
}
