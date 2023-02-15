package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.Delivery;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class IDeliveryServiceImp extends IGenericServiceImp<Delivery,Long> implements IDeliveryService {
}
