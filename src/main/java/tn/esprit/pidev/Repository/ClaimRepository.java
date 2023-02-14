package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}