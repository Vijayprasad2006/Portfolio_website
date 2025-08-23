package com.bootstrap.myproj.MyRepository;

import com.bootstrap.myproj.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByEmail(String email);
}
