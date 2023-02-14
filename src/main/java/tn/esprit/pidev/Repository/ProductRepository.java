package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
