package ch.bzz;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class booking {
    private String id;
    private String bookingNumber;
    private LocalDate date;
    private String text;
    private account debitAccount;
    private account creditAccount;
    private BigDecimal amount;
    private project project;
}