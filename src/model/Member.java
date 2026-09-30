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

    public User getMemberUser() {
        return memberUser;
    }

    public void setMemberUser(User memberUser) {
        this.memberUser = memberUser;
    }

    public ArrayList<GroupParticipation> getParticipations() {
        return participations;
    }

    public void setParticipations(ArrayList<GroupParticipation> participations) {
        this.participations = participations;
    }
}
