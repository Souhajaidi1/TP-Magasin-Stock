package tn.esprit.pidev.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.Entity.Notification;
import tn.esprit.pidev.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/notification")
public class NotificationController extends GenericController<Notification,Long> {
}
