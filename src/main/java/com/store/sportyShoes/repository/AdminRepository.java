package com.store.sportyShoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.sportyShoes.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{
	@Query("from Admin")
	public List<Admin> getUsers();
}
