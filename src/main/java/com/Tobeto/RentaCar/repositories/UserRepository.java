package com.Tobeto.RentaCar.repositories;

import com.Tobeto.RentaCar.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {
}


