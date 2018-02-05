package com.sample.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.sample.resources.Views;

public class SubObject {

  @JsonView(Views.PublicView.class)
  private String subName;

  private String subTitle;

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }



}
