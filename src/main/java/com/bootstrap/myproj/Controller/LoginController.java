package com.bootstrap.myproj.Controller;

import com.bootstrap.myproj.Entity.Login;
import com.bootstrap.myproj.MyRepository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class LoginController {
    @Autowired
    private LoginRepository repo;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Login login) {
        Login saveduser = repo.save(login);
        return ResponseEntity.ok(saveduser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> Loginuser(@RequestBody Login login) {
        Login user = repo.findByEmail(login.getEmail());
        if (user != null && user.getPassword().equals(login.getPassword())) {
            return ResponseEntity.ok("Login success");
        } else {
            return ResponseEntity.status(401).body("Invalid Credentials");
        }
    }
}
