package com.prospersllc.controller;

import com.prospersllc.model.CompanyInfo;
import com.prospersllc.repository.CompanyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyInfoController {

    @Autowired
    private CompanyInfoRepository companyInfoRepository;

    @GetMapping("/companyInfo")
    public CompanyInfo getCompanyInfo() {
        return companyInfoRepository.findById("1").orElse(null); // Adjust as needed
    }
}
