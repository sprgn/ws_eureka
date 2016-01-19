package com.jbhunt.ws.eureka;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class LogbackShutdownListener implements ServletContextListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void contextDestroyed(ServletContextEvent sce) {
        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        this.logger.warn("Shutting down loggerContext in contextDestroyed");
        context.stop();
    }

    public void contextInitialized(ServletContextEvent sce) {
    }
}
