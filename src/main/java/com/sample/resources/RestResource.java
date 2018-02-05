package com.sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;
import com.sample.domain.DomainObject;
import com.sample.service.SampleService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RestResource {

  @Autowired
  private SampleService service;

  @GET
  @Path("get-viewed-object")
  @JsonView(Views.PublicView.class)
  public DomainObject getViewedObject() {
    return service.getValue();
  }

  @GET
  @Path("get-object")
  public DomainObject getObject() {
    return service.getValue();
  }
}
