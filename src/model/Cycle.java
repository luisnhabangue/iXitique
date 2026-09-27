package model;

import jakarta.persistence.*;
import model.enums.CycleStatus;

import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "ciclos",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_ciclo_grupo_numero",
                        columnNames = {"grupo_id", "numero"}
                )
        })
public class Cycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = false)
    private Group group;


    @Column(nullable = false)
    private Integer numero;

    private Date startDate;

    private Date endDate;

    @Enumerated(EnumType.STRING)
    private CycleStatus status;

    @OneToMany(mappedBy = "ciclo")
    private List<Contribuition> contribuition;
}
