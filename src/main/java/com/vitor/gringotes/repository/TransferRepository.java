package com.vitor.gringotes.repository;

import com.vitor.gringotes.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferRepository  extends JpaRepository<Transfer, UUID> {
}
