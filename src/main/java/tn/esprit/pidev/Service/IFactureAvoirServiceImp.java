package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.FactureAvoir;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class IFactureAvoirServiceImp extends IGenericServiceImp<FactureAvoir,Long> implements IFactureAvoirService {
}
