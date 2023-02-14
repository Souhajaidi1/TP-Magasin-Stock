package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}