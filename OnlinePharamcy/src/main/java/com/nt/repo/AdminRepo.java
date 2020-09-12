package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Adminloginentity;

public interface AdminRepo extends CrudRepository<Adminloginentity, Integer> {

}
