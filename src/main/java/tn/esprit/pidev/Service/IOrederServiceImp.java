package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.Orderc;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class IOrederServiceImp extends IGenericServiceImp<Orderc,Long> implements IOrederService {
}
