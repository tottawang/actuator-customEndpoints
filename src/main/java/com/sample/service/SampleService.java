package com.sample.service;

import org.springframework.stereotype.Component;

import com.sample.domain.DomainObject;
import com.sample.domain.SubObject;

@Component
public class SampleService {

  public DomainObject getValue() {
    DomainObject object = new DomainObject();
    object.setName("name");
    object.setTitle("title");
    object.setAddress("address");
    SubObject subObject = new SubObject();
    subObject.setSubName("subName");
    subObject.setSubTitle("subTitle");
    object.setSubObject(subObject);
    return object;
  }

}
