package tn.esprit.pidev.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.Entity.FactureAvoir;
import tn.esprit.pidev.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/facture_avoir")
public class FactureAvoirController extends GenericController<FactureAvoir,Long> {
}
