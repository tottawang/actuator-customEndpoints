package com.sample.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.endpoint.mvc.AbstractMvcEndpoint;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
public class ActiveUsersActuatorEndpoint extends AbstractMvcEndpoint {

  public ActiveUsersActuatorEndpoint() {
    super("/activeusers", false /* sensitive */);
  }

  @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ActiveUsersResponse listActiveUsers() {
    return new ActiveUsersResponse("Active users right now", Arrays.asList("user1", "user2"));
  }

  @JsonPropertyOrder({"info", "activeUsers"})
  public static class ActiveUsersResponse {

    @JsonProperty
    private String info;

    @JsonProperty
    private List<String> activeUsers;

    public ActiveUsersResponse(String info, List<String> activeUsers) {
      this.info = info;
      this.activeUsers = activeUsers;
    }
  }

}
