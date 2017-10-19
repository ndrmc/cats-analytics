package org.cats.analytics.operation.service;

import org.bson.types.ObjectId;
import org.cats.analytics.operation.domain.Operation;
import org.cats.analytics.operation.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class OperationService {

    private OperationRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    public OperationService(OperationRepository operationRepository){
        this.repository = operationRepository;
    }

    @Transactional
    public Operation save(@NotNull @Valid Operation operation) {
        return repository.save(operation);
    }

    @Transactional(readOnly = true)
    public List<Operation> getList() {
        return repository.findAll();
    }

    public Operation findByOperationId(Long id) {
        return repository.findByOperationId(id);
    }

}
