package org.cats.analytics.operation.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cats.analytics.operation.domain.Dispatch;
import org.cats.analytics.operation.domain.Operation;
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

}
