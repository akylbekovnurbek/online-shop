package kg.easyit.onlineshop.model.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateTransactionRequest {
    String purpose;
    BigDecimal amount;
    Long accountToId;
    Long accountFromId;
}
