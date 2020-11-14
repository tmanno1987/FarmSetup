package com.farm.configs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	private EntityManager em;
	
	@Autowired
	public MyDataRestConfig(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration rrc) {
		exposeIds(rrc);
	}
	
	@SuppressWarnings("rawtypes")
	private void exposeIds(RepositoryRestConfiguration rrc) {
		Set<EntityType<?>> ents = em.getMetamodel().getEntities();
		List<Class> entCls = new ArrayList<>();
		
		for(EntityType e: ents) {
			entCls.add(e.getJavaType());
			Class[] domTypes = entCls.toArray(new Class[0]);
			rrc.exposeIdsFor(domTypes);
		}
	}
}



