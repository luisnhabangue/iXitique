package model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class GroupParticipation {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne
        private Member membro;

        @ManyToOne
        private Group grupo;

        private Date dataEntrada;

        private boolean ativo;

    public GroupParticipation() {
    }
}
