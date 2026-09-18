package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;
    private ArrayList<Member> member;
    private Contribuition contribuition;

    public Group(int groupId, String groupName, ArrayList<Member> member) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.member = member;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Member> getMember() {
        return member;
    }

    public void setMember(ArrayList<Member> member) {
        this.member = member;
    }
}
