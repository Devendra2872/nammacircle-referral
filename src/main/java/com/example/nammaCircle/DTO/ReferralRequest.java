package com.example.nammaCircle.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReferralRequest {
    private Long referrerId;
    private Long candidateId;
    private Long companyId;
}