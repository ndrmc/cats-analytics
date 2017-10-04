package org.cats.analytics.resource.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "requirement")
public class Requirement {
    @Id
    private Long id;
    private String type;

}
