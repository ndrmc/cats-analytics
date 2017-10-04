package org.cats.analytics.resource.repository;

import org.cats.analytics.resource.domain.GiftCertificate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GiftCertificateRepository extends MongoRepository<GiftCertificate, Long> {
}
