package com.vitor.gringotes.dto;

import com.vitor.gringotes.entity.Wallet;
import com.vitor.gringotes.entity.WalletType;

public record CreateWalletDto(
        String fullName,
        String cpfCnpj,
        String email,
        String password,
        Long walletTypeId
) {}
