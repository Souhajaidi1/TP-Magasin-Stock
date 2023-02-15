package tn.esprit.pidev.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.Entity.Product;
import tn.esprit.pidev.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController extends GenericController<Product,Long> {
}
