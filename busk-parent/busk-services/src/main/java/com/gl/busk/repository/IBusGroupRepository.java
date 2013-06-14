package com.gl.busk.repository;

import java.util.List;

import com.gl.busk.domain.BusGroup;
import com.gl.busk.domain.BusLine;

public interface IBusGroupRepository {

	public BusGroup save(BusGroup group);
	public List<BusGroup> findAll();
	public List<BusLine> findAllBusLines(Long busGroupId);
}
