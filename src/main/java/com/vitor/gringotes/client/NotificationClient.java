package com.vitor.gringotes.client;


import com.vitor.gringotes.entity.Transfer;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "NotificationClient",
        url = "${client.notification-service.url}"
)
public interface NotificationClient {


    @PostMapping
    ResponseEntity<Void> sendNotification(@RequestBody Transfer transfer);
}
