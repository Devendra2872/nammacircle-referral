package com.example.nammaCircle.Models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "referrals", uniqueConstraints = @UniqueConstraint(columnNames = {"candidate_id", "company_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "candidate_id")
    private Long candidateId;

    //@Column(name = "company_id")
    private Long companyId;

    // @Column(name = "referrer_id")
    private Long referrerId;

}
