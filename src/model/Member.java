package model;

import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @OneToOne
    @JoinColumn(name = "member_user_id")
    private User memberUser;

    @OneToMany(mappedBy = "membro")
    private ArrayList<GroupParticipation> participations;


    public Member() {

    }
}
