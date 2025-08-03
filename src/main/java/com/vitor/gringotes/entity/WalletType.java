package com.vitor.gringotes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_wallet_type")
public class WalletType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public WalletType() {
    }

    public WalletType(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public enum Enum {

        USER("user"),
        MERCHANT("merchant");

        private final String description;

        Enum(String description) {
            this.description = description;
        }

        public WalletType get() {
            WalletType type = new WalletType();
            type.setDescription(description);
            return type;
        }
    }

}

