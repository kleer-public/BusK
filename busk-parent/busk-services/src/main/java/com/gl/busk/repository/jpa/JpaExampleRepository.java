package com.gl.busk.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.gl.busk.repository.IExampleRepository;


@Repository
public class JpaExampleRepository implements IExampleRepository{
	
	@PersistenceContext
	private EntityManager em;
	
//	public Task saveUpdateTask(Task task){
//		return em.merge(task);
//	}
//
//	public void remove(Task task) throws EntityNotFoundException{
//		em.remove(find(task.getId()));
//	}
//
//	public Task find(Long id) throws EntityNotFoundException{
//		Task task = em.find(Task.class, id);
//		if( task == null )
//			throw new EntityNotFoundException();
//		return task;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Task> findTasks(User user){
//		Query q = em.createQuery("FROM tasks where user = :user");
//        q.setParameter("user", user);
//		List<Task> resultList = q.getResultList();
//		return resultList;
//	}

}
