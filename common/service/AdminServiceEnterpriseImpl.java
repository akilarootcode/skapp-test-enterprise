package com.skapp.enterprise.common.service;

import com.skapp.community.common.service.AdminService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceEnterpriseImpl implements AdminServiceEnterprise{

    @NonNull
    private final AdminService adminService;

}
