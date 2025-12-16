package ua.maister.charm.back.model;

public class Profile {

    private Long id;

    private String email;

    private String name;

    private String surname;

    private String about;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Profile{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", nam='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", about='" + about + '\'' +
            '}';
    }
}
