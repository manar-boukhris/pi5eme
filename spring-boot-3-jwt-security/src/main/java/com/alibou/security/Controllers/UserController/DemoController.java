package com.alibou.security.Controllers.UserController;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@Hidden
public class DemoController {

  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }


  @GetMapping("/all")
  public ResponseEntity<String> demo(){
    return ResponseEntity.ok("hello from secured url");
  }

  @GetMapping("/admin_only")
  public ResponseEntity<String> adminOnly(){
    return ResponseEntity.ok("hello from adminOnly");
  }

  @GetMapping("/client_only")
  public ResponseEntity<String> clientOnly(){
    return ResponseEntity.ok("hello from clientOnly");
  }

  @GetMapping("/investor_only")
  public ResponseEntity<String> investorOnly(){
    return ResponseEntity.ok("hello from investorOnly");
  }

  @GetMapping("/trainer_only")
  public ResponseEntity<String> trainerOnly(){
    return ResponseEntity.ok("hello from trainerOnly");
  }


}
