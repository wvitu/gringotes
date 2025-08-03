package com.vitor.gringotes.repository;

import com.vitor.gringotes.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
    Optional<WalletType> findByDescription(String description);

}
