package com.example.nammaCircle.Service;

import com.example.nammaCircle.Exception.DuplicateReferralException;
import com.example.nammaCircle.Models.Referral;
import com.example.nammaCircle.Repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferralService {

    @Autowired
    private ReferralRepository referralRepository;

    public Referral refer(Long referrerId, Long candidateId, Long companyId) throws DuplicateReferralException {
        // Application-level check (first line of defense)
        boolean alreadyReferred = referralRepository
                .existsByCandidateIdAndCompanyId(candidateId, companyId);

        if (alreadyReferred) {
            throw new DuplicateReferralException(
                    "This candidate has already been referred to this company."
            );
        }

        Referral referral = Referral.builder()
                .referrerId(referrerId)
                .candidateId(candidateId)
                .companyId(companyId)
                .build();
        return referralRepository.save(referral); // DB constraint = second line of defense
    }
}