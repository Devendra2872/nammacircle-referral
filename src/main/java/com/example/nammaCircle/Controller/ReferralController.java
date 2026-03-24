package com.example.nammaCircle.Controller;

import com.example.nammaCircle.DTO.ReferralRequest;
import com.example.nammaCircle.Exception.DuplicateReferralException;
import com.example.nammaCircle.Models.Referral;
import com.example.nammaCircle.Service.ReferralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/referrals")
public class ReferralController {

    @Autowired
    private ReferralService referralService;

    @PostMapping("/refer")
    public ResponseEntity<Referral> refer(@RequestBody ReferralRequest request) throws DuplicateReferralException {

        Referral referral = referralService.refer(
                request.getReferrerId(),
                request.getCandidateId(),
                request.getCompanyId()
        );
        return ResponseEntity.ok(referral);
    }
}
