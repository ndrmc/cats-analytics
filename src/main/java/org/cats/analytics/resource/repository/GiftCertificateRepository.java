package org.cats.analytics.resource.repository;

import org.bson.types.ObjectId;
import org.cats.analytics.resource.domain.GiftCertificate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface GiftCertificateRepository extends MongoRepository<GiftCertificate, Long> {
}
