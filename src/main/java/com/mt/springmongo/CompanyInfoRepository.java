package com.prospersllc.repository;

import com.prospersllc.model.CompanyInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyInfoRepository extends MongoRepository<CompanyInfo, String> {
}
