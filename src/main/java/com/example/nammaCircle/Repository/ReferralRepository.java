package com.example.nammaCircle.Repository;

import com.example.nammaCircle.Models.Referral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferralRepository extends JpaRepository<Referral, Long> {

    boolean existsByCandidateIdAndCompanyId(Long candidateId, Long companyId);

}
