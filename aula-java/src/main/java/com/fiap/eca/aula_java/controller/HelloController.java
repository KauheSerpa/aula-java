package com.fiap.eca.aula_java.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Olá, Spring Boot!";
    }
}

git config --global user.name "KauheSerpa"
git config --global user.email "kakirtwions@gmail.com"
git init
git add
git commit -m "Aula Java - Iniciando com Spring Boot"
git remote add origin https://github.com/KauheSerpa/aula-java.git
git branch -M main
git push -u origin main