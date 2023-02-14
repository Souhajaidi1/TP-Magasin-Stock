package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.FactureAvoir;

public interface FactureAvoirRepository extends JpaRepository<FactureAvoir, Long> {
}