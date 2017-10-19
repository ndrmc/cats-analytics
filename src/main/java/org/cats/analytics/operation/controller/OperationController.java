package org.cats.analytics.operation.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cats.analytics.operation.domain.*;
import org.cats.analytics.operation.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "operation", description = "operation" )
public class OperationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationController.class);

    private OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService){
        this.operationService = operationService;
    }

    @ApiOperation(value = "Create a new Operation record" )
    @RequestMapping(value = "/operation", method = RequestMethod.POST)
    public Operation createOperation(@RequestBody @Valid final Operation operation) {
        LOGGER.debug("Creating operation", operation);
        return operationService.save(operation);
    }

    @ApiOperation(value = "Return all operations")
    @RequestMapping(value = "/operation", method= RequestMethod.GET)
    public List<Operation> getAllOperations(){
        return operationService.getList();
    }

    @ApiOperation(value = "Add Regional Request")
    @RequestMapping(value = "/insertRegionalRequest", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insertRegionalRequest(@RequestBody RegionalRequest regionalRequest) {
        Operation operation = operationService.findByOperationId(regionalRequest.getOperationId());
        List<RegionalRequest> regionalRequests;
        if(operation.getRegionalRequests() != null)
            regionalRequests = operation.getRegionalRequests();
        else
            regionalRequests = new ArrayList<>();
        regionalRequests.add(regionalRequest);
        operation.setRegionalRequests(regionalRequests);
        this.operationService.save(operation);
        return new ResponseEntity("Regional Request saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Add Requisition")
    @RequestMapping(value = "/insertRequisition", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insertRequisition(@RequestBody Requisition requisition) {
        Operation operation = operationService.findByOperationId(requisition.getOperationId());
        List<Requisition> requisitions;
        if(operation.getRequisitions() != null)
            requisitions = operation.getRequisitions();
        else
            requisitions = new ArrayList<>();
        requisitions.add(requisition);
        operation.setRequisitions(requisitions);
        this.operationService.save(operation);
        return new ResponseEntity("Requisition saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Add Dispatch")
    @RequestMapping(value = "/insertDispatch", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insertDispatch(@RequestBody Dispatch dispatch) {
        Operation operation = operationService.findByOperationId(dispatch.getOperationId());
        List<Dispatch> dispatches;
        if(operation.getDispatches() != null)
            dispatches = operation.getDispatches();
        else
            dispatches = new ArrayList<>();
        dispatches.add(dispatch);
        operation.setDispatches(dispatches);
        this.operationService.save(operation);
        return new ResponseEntity("Dispatch saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Add Delivery")
    @RequestMapping(value = "/insertDelivery", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity insertDelivery(@RequestBody Delivery delivery) {
        Operation operation = operationService.findByOperationId(delivery.getOperationId());
        List<Delivery> deliveries;
        if(operation.getDeliveries() != null)
            deliveries = operation.getDeliveries();
        else
            deliveries = new ArrayList<>();
        deliveries.add(delivery);
        operation.setDeliveries(deliveries);
        this.operationService.save(operation);
        return new ResponseEntity("Delivery saved successfully", HttpStatus.OK);
    }

}
