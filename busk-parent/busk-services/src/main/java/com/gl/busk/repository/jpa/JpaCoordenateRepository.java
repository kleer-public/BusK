package com.gl.busk.repository.jpa;

import com.gl.busk.domain.Coordenate;
import com.gl.busk.repository.ICoordenateRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class JpaCoordenateRepository implements ICoordenateRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Coordenate saveUpdateCoordenate(Coordenate coordenate) {
        return em.merge(coordenate);
    }

//	public void remove(Task task) throws EntityNotFoundException{
//		em.remove(find(task.getId()));
//	}

//	public Task find(Long id) throws EntityNotFoundException{
//		Task task = em.find(Task.class, id);
//		if( task == null )
//			throw new EntityNotFoundException();
//		return task;
//	}

    @Override
    @SuppressWarnings("unchecked")
    public List<Coordenate> findCoordenates() {
        Query q = em.createQuery("FROM coordenates");
        List<Coordenate> resultList = q.getResultList();
        return resultList;
    }

}
