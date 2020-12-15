package vsvdev.dao.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsvdev.model.patient.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
