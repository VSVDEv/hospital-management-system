package vsvdev.dao.doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsvdev.model.doctor.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
