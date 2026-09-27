package model;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.Date;


@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long groupId;
    private String groupName;
    private String groupDescription;
    private Date startDate;
    private boolean isActive;
    private BigDecimal contribuition;

    private Integer period;

    @OneToMany(mappedBy = "grupo")
    public ArrayList<GroupParticipation> participations;




}
