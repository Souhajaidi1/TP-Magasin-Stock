package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.RatingProduct;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class IRatingServiceImp extends IGenericServiceImp<RatingProduct,Long> implements IRatingService {
}
