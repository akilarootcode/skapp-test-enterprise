package com.skapp.enterprise.common.controller.v1;

import com.skapp.community.common.service.AdminService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminEnterpriseController {

    @NonNull
    private final AdminService adminService;

    @GetMapping("/test/enterprise")
    public String testController() {
        return adminService.testCommunityService();
    }
}
