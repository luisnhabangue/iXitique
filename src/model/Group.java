package model;

public class Group {

    private long groupId;
    private String groupName;
    private Member members;
    private Contribuition contribuition;



    public Group(long groupId, String groupName, Member members) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = members;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Member getMembers() {
        return members;
    }

    public void setMembers(Member members) {
        this.members = members;
    }
}
