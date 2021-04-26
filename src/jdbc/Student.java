package jdbc;

public class Student {

    private int id;
    private String name;
    private String gender;
    private String birthday;
    private String hometown;
    private Long scholarship;

    public Student() {
    }

    public Student(int id, String name, String gender, String birthday, String hometown, Long scholarship) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.hometown = hometown;
        this.scholarship = scholarship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Long getScholarship() {
        return scholarship;
    }

    public void setScholarship(Long scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", hometown='" + hometown + '\'' +
                ", scholarship=" + scholarship +
                '}';
    }
}
