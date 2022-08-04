package com.example.demo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorsDao extends JpaRepository<Visitors,Integer>{
	
	@Query("from Visitors where name=?1 and pass=?2")
	public List<Visitors> CheckUser(String name,String pass);
	
	@Query("from Visitors order by vid ASC")
	public List<Visitors> checkVID(Visitors d);

}
