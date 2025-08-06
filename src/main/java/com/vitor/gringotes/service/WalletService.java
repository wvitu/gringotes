package com.vitor.gringotes.service;

import com.vitor.gringotes.controller.dto.CreateWalletDto;
import com.vitor.gringotes.entity.Wallet;
import com.vitor.gringotes.exception.DataExistingException;
import com.vitor.gringotes.repository.WalletRepository;
import com.vitor.gringotes.repository.WalletTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;
    private final WalletTypeRepository walletTypeRepository;

    public WalletService(WalletRepository walletRepository, WalletTypeRepository walletTypeRepository) {
        this.walletRepository = walletRepository;
        this.walletTypeRepository = walletTypeRepository;
    }

    public Wallet createWallet(CreateWalletDto dto) {
        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());
        if (walletDb.isPresent()) {
            throw new DataExistingException("CPF/CNPJ or Email already exists");
        }

        var walletType = walletTypeRepository.findById(dto.walletTypeId())
                .orElseThrow(() -> new IllegalArgumentException("Tipo de carteira não encontrado"));

        Wallet wallet = new Wallet();
        wallet.setFullName(dto.fullName());
        wallet.setCpfCnpj(dto.cpfCnpj());
        wallet.setEmail(dto.email());
        wallet.setPassword(dto.password());
        wallet.setWalletType(walletType);

        return walletRepository.save(wallet);
    }

}
