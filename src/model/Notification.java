package model;

import java.time.LocalDate;

public class Notification {

    private String id;
    private Member member;
    private MessageType messageType;
    private String message;
    private LocalDate date;
    private boolean read;

    public Notification(String id, Member member, MessageType messageType, String message, LocalDate date, boolean read) {
        this.id = id;
        this.member = member;
        this.messageType = messageType;
        this.message = message;
        this.date = date;
        this.read = read;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", member=" + member +
                ", messageType=" + messageType +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", read=" + read +
                '}';
    }
}

