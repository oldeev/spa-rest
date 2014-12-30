package com.ayyagari.sparest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("persons")
public class PersonRestResource {

  @GET
  @Produces(APPLICATION_JSON)
  public String get() {
    return "{\"name\":\"John Doe\", \"age\": 35}";
  }
}
