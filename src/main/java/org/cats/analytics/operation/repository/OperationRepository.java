package org.cats.analytics.operation.repository;

import org.cats.analytics.operation.domain.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperationRepository  extends MongoRepository<Operation, Long> {
    Operation findByOperationId(int operationId);
}
