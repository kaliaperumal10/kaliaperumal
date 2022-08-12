package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientDao extends JpaRepository<Client,Integer>{
	
	@Query("from Client where name=?1 and pass1=?2")
	public List<Client> CheckUser(String name,String pass1);
	
	@Query("from Client order by cid ASC")
	public List<Client> checkCID(Client d);
}
 




