package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.CommentPost;

public interface CommentPostRepository extends JpaRepository<CommentPost, Long> {
}