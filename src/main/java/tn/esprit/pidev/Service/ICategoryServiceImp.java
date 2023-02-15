package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.CategoryProduct;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class ICategoryServiceImp extends IGenericServiceImp<CategoryProduct,Long> implements ICategoryService {
}
