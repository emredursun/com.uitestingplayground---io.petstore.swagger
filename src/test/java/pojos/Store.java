package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Store {
    private String id;
    private String petId;
    private String quantity;
    private String shipDate;
    private String status;
    private String complete;

    public Store(){}

    public Store(String id, String petId, String quantity, String shipDate, String status, String complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }
}
