package org.cats.analytics.resource.service;

import org.cats.analytics.resource.domain.DonorGift;
import org.cats.analytics.resource.domain.GiftCertificate;
import org.cats.analytics.resource.repository.GiftCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

@Service
public class GiftCertificateService {

    private GiftCertificateRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    public GiftCertificateService(GiftCertificateRepository giftCertificateRepository){
        this.repository = giftCertificateRepository;
    }

    @Transactional
    public GiftCertificate save(@NotNull @Valid GiftCertificate giftCertificate) {
        return repository.save(giftCertificate);
    }

    @Transactional(readOnly = true)
    public List<GiftCertificate> getList() {
        return repository.findAll();
    }


    public List<DonorGift> donorGifts(String donorName, Date fromDate, Date toDate){
        // Add aggregate qurey to filter gift certificates based on provided criteria.
        Aggregation aggregate = newAggregation();

        AggregationResults<DonorGift> results = mongoTemplate.aggregate(aggregate,"",DonorGift.class);
        return results.getMappedResults();
    }



}
