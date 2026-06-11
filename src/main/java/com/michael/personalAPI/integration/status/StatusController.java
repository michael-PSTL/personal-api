package com.michael.personalAPI.integration.status;

import com.michael.personalAPI.integration.status.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    private final StatusService StatusService;

    public StatusController(StatusService StatusService) {
        this.StatusService = StatusService;
    }

    @GetMapping("/api/hero/status")
    public StatusResponse getStatus() {
        return StatusService.getStatus();
    }
}
