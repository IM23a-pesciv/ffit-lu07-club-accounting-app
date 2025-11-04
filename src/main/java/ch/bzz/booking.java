package ch.bzz;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
@Data
public class booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bookingNumber", nullable = false, unique = true, length = 20)
    private String bookingNumber;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "text", length = 255)
    private String text;

    @ManyToOne
    @JoinColumn(name = "debitAccountId", nullable = false)
    private account debitAccount;

    @ManyToOne
    @JoinColumn(name = "creditAccountId", nullable = false)
    private account creditAccount;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "projectName", nullable = false)
    private project project;
}
