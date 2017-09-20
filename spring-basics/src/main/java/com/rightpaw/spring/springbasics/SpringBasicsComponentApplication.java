package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rightpaw.spring.componentscan")
public class SpringBasicsComponentApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsComponentApplication.class);

  public static void main(String[] args) {
    ApplicationContext ac = SpringApplication.run(SpringBasicsComponentApplication.class, args);
    ComponentDAO componentDAO = ac.getBean(ComponentDAO.class);

    LOGGER.info("{}", componentDAO);
  }
}
