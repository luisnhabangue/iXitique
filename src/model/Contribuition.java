package model;

import jakarta.persistence.*;
import model.enums.ContributionStatus;
import model.enums.PaymentMethod;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "contribuicoes")
public class Contribuition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "participation_id", nullable = false)
    private GroupParticipation groupParticipation;


    private BigDecimal amount;

    private Date paymentDate;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private ContributionStatus status;

    @ManyToOne
    @JoinColumn(name = "ciclo_id", nullable = false)
    private Cycle ciclo;


    public Contribuition() {
    }
}
