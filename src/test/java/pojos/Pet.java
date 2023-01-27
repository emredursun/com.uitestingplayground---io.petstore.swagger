package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {
    private String id;
    private String name;
    private String status;

    public Pet() {}

    public Pet(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
