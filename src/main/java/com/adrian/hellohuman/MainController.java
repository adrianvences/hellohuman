package com.adrian.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  
  @RequestMapping("")
  public String index(@RequestParam(value="q",required=false) String searchQuery){
    if(searchQuery == null) {
      return "Hello human";
    }else {
      return "hello " + searchQuery;
    }
  
  }
}
