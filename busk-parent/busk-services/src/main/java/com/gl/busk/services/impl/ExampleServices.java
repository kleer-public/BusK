package com.gl.busk.services.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.busk.services.IExampleServices;

@Service
@Transactional
public abstract class ExampleServices implements IExampleServices{
	
}
