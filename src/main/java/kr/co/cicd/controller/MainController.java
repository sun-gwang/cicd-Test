package kr.co.cicd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor @Controller
public class MainController {

    private final BuildProperties buildProperties;
    @GetMapping("/")
    public String index(Model model){
        String version = buildProperties.getVersion();
        model.addAttribute("version", version);
        return "/index";
    }
}
