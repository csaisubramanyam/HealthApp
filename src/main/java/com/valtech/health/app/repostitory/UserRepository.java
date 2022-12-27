package com.valtech.health.app.repostitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.health.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/* This method finds nurse by email */
	User findByEmail(String email);

	/* This method finds nurse by user name */
	User findByUsername(String username);

	/* This method finds nurse by password */
	User findByPassword(String password);

	/* This method retrieves user name by id */
	User findUsernameById(int id);

	/* This method retrieves user name by id */
	User findIdByUsername(String username);

	User findByName(String name);

	User findByOtp(int otp);

	/* @Query(value = "SELECT u FROM User u WHERE u.getRole=DOCTOR ")
	   public List<User> findAllDoctors();*/
	
}
