package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.RatingProduct;

public interface RatingRepository extends JpaRepository<RatingProduct,Long> {

}
