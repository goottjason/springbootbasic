package com.kjw.bootbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templateex")
public class TemplateController {

  @GetMapping("/fragment")
  public String template() {
    return "/templateex/fragment/fragmentMain";
  }
  @GetMapping("/layout")
  public String layout() {
    return "/templateex/layout/layoutMain";
  }
}
