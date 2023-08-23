package az.company.mspublisher.model.queue;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardDto  implements Serializable {
    @Serial
    private static final long serialVersionUID = 6546124315671L;

    String pan;
    LocalDate expireDate;
    String cvv;
    String cardholder;
}