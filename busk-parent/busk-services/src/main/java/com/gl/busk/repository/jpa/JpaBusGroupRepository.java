package com.gl.busk.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.gl.busk.domain.BusGroup;
import com.gl.busk.domain.BusLine;
import com.gl.busk.repository.IBusGroupRepository;
@Repository
public class JpaBusGroupRepository implements IBusGroupRepository {
	@PersistenceContext
	private EntityManager em;

	@Override
	public BusGroup save(BusGroup group) {
		return em.merge(group);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BusGroup> findAll() {
		Query query = em.createQuery("From BusGroup");
		return (List<BusGroup>) query.getResultList();
	}

	@Override
	public List<BusLine> findAllBusLines(Long busGroupId) {
		Query query = em.createQuery("From BusLine bl where bl.busGroupId = :busGroupId").setParameter("busGroupId", busGroupId);
		return (List<BusLine>) query.getResultList();
	}

}
