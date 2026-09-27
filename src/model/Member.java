package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @OneToOne
    @JoinColumn(name = "member_user_id")
    private User memberUser;
    @ManyToMany

    @JoinColumn(name = "group_id")
    private List<Group> group;

    public User getMemberUser() {
        return memberUser;
    }

    public void setMemberUser(User memberUser) {
        this.memberUser = memberUser;
    }


    public Member() {

    }
}
