package com.vitor.gringotes.config;

import com.vitor.gringotes.entity.WalletType;
import com.vitor.gringotes.repository.WalletTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final WalletTypeRepository walletTypeRepository;

    public DataLoader(WalletTypeRepository walletTypeRepository) {
        this.walletTypeRepository = walletTypeRepository;
    }


    @Override
    public void run(String... args) {
        Arrays.stream(WalletType.Enum.values())
                .map(WalletType.Enum::get)
                .filter(type -> walletTypeRepository.findByDescription(type.getDescription()).isEmpty())
                .forEach(walletTypeRepository::save);
    }

}

