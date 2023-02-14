package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
