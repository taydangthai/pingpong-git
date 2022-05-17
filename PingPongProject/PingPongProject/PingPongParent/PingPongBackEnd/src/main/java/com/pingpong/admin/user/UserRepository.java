package com.pingpong.admin.user;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pingpong.common.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.email = :email")
	public User getUserByEmail(@Param("email") String email);

	public Long countById(Integer id);
	
	
	@Query("UPDATE User u SET u.enabled = ?2 where u.id =?1")
	@Modifying
	public void updateStatus(Integer id, Boolean enable);
}