package model1;

import model.enums.HistoryGroupStatus;

import java.sql.Date;

public class HistoryGroup {

    private Group groupId;
    private String groupDescription;
    private HistoryGroupStatus historyGroupStatus;
    private Date createdAt;
    private User createdBy;



}
