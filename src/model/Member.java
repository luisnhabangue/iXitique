package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Member extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    @ManyToMany
    @JoinColumn(name = "group_id")
    private List<Group> group;
    private int points;

    public Member(Integer memberId, List<Group> group, int points) {
        this.memberId = memberId;
        this.group = group;
        this.points = points;
    }

}
