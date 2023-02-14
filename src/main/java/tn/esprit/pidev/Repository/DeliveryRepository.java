package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}