package com.sample.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.sample.resources.Views;

@JsonIgnoreProperties({"address", "policyId"})
public class DomainObject {

  @JsonView(Views.PublicView.class)
  private String name;

  private String title;

  private String address;

  @JsonView(Views.PublicView.class)
  private SubObject subObject;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SubObject getSubObject() {
    return subObject;
  }

  public void setSubObject(SubObject subObject) {
    this.subObject = subObject;
  }

  public String getPolicyId() {
    return "dummy policy id";
  }


}

