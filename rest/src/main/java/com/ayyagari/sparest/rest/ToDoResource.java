package com.ayyagari.sparest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("todos")
public class ToDoResource {

  @GET
  @Produces(APPLICATION_JSON)
  public String get() {
    //hardcoded for now.
    return "[{\"id\":\"abcdef1234\", \"title\":\"first todo\", \"body\": \"body goes here\", \"dueDateTime\":\"2014-12-31T16:45:20-06:00\", \"reminder\":\"1 hr\"},"
           + "{\"id\":\"bcdefg234\", \"title\":\"second todo\", \"body\": \"body explodes here\", \"dueDateTime\":\"2015-01-15T12:15:20-05:00\", \"reminder\":\"1 day\"}]";
  }
}
