package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
public class DeliveryItem {
    @Id
    private ObjectId id;
    private Long deliveryItemId;
    private Long deliveryId;
    private Long commodityId;
    private String commodityName;
    private Long unitOfMeasureId;
    private String unitOfMeasureName;
    private BigDecimal sentQuantity;
    private BigDecimal sentQuantityMT;
    private BigDecimal receivedQuantity;
    private BigDecimal receivedQuantityMT;
    private Long createdById;
    private String createdByName;
    private Long modifiedById;
    private String modifiedByName;
    private Boolean deleted;
    private Date deletedAt;
    private Date createdAt;
    private Date modifiedAt;
}
