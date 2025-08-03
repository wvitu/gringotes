package com.vitor.gringotes.repository;

import com.vitor.gringotes.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

}
