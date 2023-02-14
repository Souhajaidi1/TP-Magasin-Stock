package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}