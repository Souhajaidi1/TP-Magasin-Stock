package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}