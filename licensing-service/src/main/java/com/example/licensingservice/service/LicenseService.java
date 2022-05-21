package com.example.licensingservice.service;

import com.example.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService {

    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId(UUID.randomUUID().toString())
                .withProductName("Test product Name")
                .withLicenseType("PerSeat");
    }
}
