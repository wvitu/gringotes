package com.vitor.gringotes.dto;

import com.vitor.gringotes.entity.Wallet;
import com.vitor.gringotes.entity.WalletType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWalletDto(
        @NotBlank String fullName,
        @NotBlank String cpfCnpj,
        @NotBlank String email,
        @NotBlank String password,
        @NotNull Long walletTypeId
) {}
