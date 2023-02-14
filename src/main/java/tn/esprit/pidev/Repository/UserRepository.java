package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.User;
import tn.esprit.pidev.generic.BaseRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
