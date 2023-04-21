package com.sujth.fraud;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService
{
    private final FraudCheckHistoryRepoitory fraudCheckHistoryRepoitory;



    public boolean isFraudlentCustomer(Integer customerId)
    {
        fraudCheckHistoryRepoitory.save(FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                .build());
        return false;
    }
}
