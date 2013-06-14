package com.gl.busk.services.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dumbster.smtp.SimpleSmtpServer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class TestBase extends TestCase{
	
	private static InitialContext initialContext;
	private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected static SimpleSmtpServer smtpFakeServer; 
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		try {
			// set the context factory
			System.setProperty("java.naming.factory.initial",
					"org.apache.xbean.spring.jndi.SpringInitialContextFactory");

			// initialize context. the object instance is not important, but in
			// the process, the context is loaded.
			initialContext = new InitialContext();

		} catch (NamingException ex) {
			logger.error("Cannot init test context.", ex);
		}
	}
	
	@Test
	public void testContext() {
		Assert.assertNotNull(initialContext);
	}

}
