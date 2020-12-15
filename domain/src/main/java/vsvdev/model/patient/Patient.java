package vsvdev.model.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Patient {
@Id
private int id;
private String name;
private String disease;

    public Patient() {
    }

    public Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getId() == patient.getId() &&
                Objects.equals( getName(), patient.getName() ) &&
                Objects.equals( getDisease(), patient.getDisease() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getId(), getName(), getDisease() );
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }
}
