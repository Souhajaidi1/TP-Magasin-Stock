package tn.esprit.pidev.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.Entity.Claim;
import tn.esprit.pidev.generic.IGenericServiceImp;

@Service
@RequiredArgsConstructor
public class IClaimServiceImp extends IGenericServiceImp<Claim,Long> implements IClaimService {
}
