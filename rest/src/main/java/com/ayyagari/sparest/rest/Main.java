package com.ayyagari.sparest.rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {

  public static void main(String[] args) {
    WebAppContext webAppContext = new WebAppContext("src/main/webapp", "/addressbook");
    new Main().startServer(webAppContext);
  }

  public void startServer(WebAppContext webAppContext) {
    try {
      Server server = new Server(9090);
      server.setHandler(webAppContext);
      server.start();
      server.join();
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }
}
