package org.cats.analytics.resource.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cats.analytics.resource.domain.GiftCertificate;
import org.cats.analytics.resource.service.GiftCertificateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "gift certificate", description = "Resources coming through donation" )
public class GiftCertificateController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GiftCertificateController.class);

    private GiftCertificateService service;

    @Autowired
    public GiftCertificateController(GiftCertificateService giftCertificateService){
        this.service = giftCertificateService;
    }

    @ApiOperation(value = "Create a new Gift Certificate record" )
    @RequestMapping(value = "/giftcertificate", method = RequestMethod.POST)
    public GiftCertificate createGiftCertificate(@RequestBody @Valid final GiftCertificate giftCertificate) {
        LOGGER.debug("Creating gift certificate", giftCertificate);
        return service.save(giftCertificate);
    }

    @ApiOperation(value = "Return all gift certificates")
    @RequestMapping(value = "/giftcertificate", method= RequestMethod.GET)
    public List<GiftCertificate> getAllGiftCertificates(){
        return service.getList();
    }

}
