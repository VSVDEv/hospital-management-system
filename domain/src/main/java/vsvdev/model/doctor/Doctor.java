package vsvdev.model.doctor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialty;


    public Doctor(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }


    public Doctor() {
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return getId() == doctor.getId() &&
                Objects.equals( getName(), doctor.getName() ) &&
                Objects.equals( getSpecialty(), doctor.getSpecialty() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getId(), getName(), getSpecialty() );
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
