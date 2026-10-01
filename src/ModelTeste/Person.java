package ModelTeste;

import model.enums.Gender;

import java.sql.Date;

public class Person {

    private Long id;
    private String LastName;
    private String FirstName;
    private Date birthDate;
    private String documentId;
    private Gender gender;


    public Person(Long id, String lastName, String firstName, Date birthDate, String documentId, Gender gender) {
        this.id = id;
        LastName = lastName;
        FirstName = firstName;
        this.birthDate = birthDate;
        this.documentId = documentId;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
