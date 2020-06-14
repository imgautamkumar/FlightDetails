package com.madhav.location.repo;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.madhav.location.entities.Location;

@Repository
public interface LocationRepositry extends JpaRepository<Location, Integer> {
	@Query(nativeQuery=true, value = "select type,count(type) from location group by type")
	//@Query(nativeQuery=true, value = "select id,code,name,type from location")
	public List<Object[]> getTypeCount();
}
