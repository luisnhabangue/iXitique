package model;

import jakarta.persistence.*;
import model.enums.ParticipationStatus;

import java.sql.Date;

@Entity
public class GroupParticipation {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "member_id", nullable = false)
        private Member member;

        @ManyToOne
        @JoinColumn(name = "grupo_id", nullable = false)
        private Group group;

        private Date dataEntrada;

        @Enumerated(EnumType.STRING)
        private ParticipationStatus estado;


    public GroupParticipation() {
    }
}
