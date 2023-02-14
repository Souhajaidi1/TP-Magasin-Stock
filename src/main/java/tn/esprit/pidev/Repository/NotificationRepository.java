package tn.esprit.pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidev.Entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}