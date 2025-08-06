package com.vitor.gringotes.controller;


import com.vitor.gringotes.controller.dto.TransferDto;
import com.vitor.gringotes.entity.Transfer;
import com.vitor.gringotes.service.TransferService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    private final TransferService transferService;


    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }


    @PostMapping("/transfer")
    public ResponseEntity<Transfer> transfer(@RequestBody @Valid TransferDto dto) {


        var resp = transferService.transfer(dto);

        return ResponseEntity.ok(resp);
    }
}
