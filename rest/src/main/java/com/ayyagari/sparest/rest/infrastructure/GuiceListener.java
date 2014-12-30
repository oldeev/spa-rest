package com.ayyagari.sparest.rest.infrastructure;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import com.ayyagari.sparest.rest.PersonRestResource;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import javax.servlet.annotation.WebListener;

@WebListener
public class GuiceListener extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new JerseyServletModule() {

      @Override
      protected void configureServlets() {

        /* bind the REST resources */
        bind(PersonRestResource.class);

        /* bind jackson converters for JAXB/JSON serialization */
//        bind(MessageBodyReader.class).to(JacksonJsonProvider.class);
//        bind(MessageBodyWriter.class).to(JacksonJsonProvider.class);

        serve("/api/*").with(GuiceContainer.class);
      }
    });
  }
}
