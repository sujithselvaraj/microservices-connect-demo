package com.sujth.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepoitory extends JpaRepository<FraudCheckHistory,Integer>
{

}
