package pl.sdacademy.spring_boot_web.SpringBootWebApp.model;

import java.util.Objects;

public class MyCourse {

    private String name;
    private String location;
    private Integer membersCount;

    public MyCourse () {

    }

    public MyCourse(String name, String location, Integer membersCount) {
        this.name = name;
        this.location = location;
        this.membersCount = membersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    @Override
    public String toString() {
        return "MyCourse{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", membersCount=" + membersCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCourse myCourse = (MyCourse) o;
        return name.equals(myCourse.name) &&
                location.equals(myCourse.location) &&
                membersCount.equals(myCourse.membersCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, membersCount);
    }
}
