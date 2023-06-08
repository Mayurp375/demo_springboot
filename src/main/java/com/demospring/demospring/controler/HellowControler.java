package com.demospring.demospring.controler;

import org.springframework.web.bind.annotation.*;

@RestController
public class HellowControler {

    @RequestMapping("/")
    public String call() {
        return "Hwko this is spring boot";
    }

//    http://localhost:8012/query?name=mayur
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hllow " + name + "!";
    }

    @GetMapping("/name{name}")
    public String sayhelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHelloUser(@PathVariable String name) {
        return "Hellow " + name + "!";
    }

    @PostMapping("/put/{firstname}")
    public String sayHello(@PathVariable String firstname,
                           @RequestParam(value = "lastname")
                           String lastname) {
        return "Hellow" + firstname + " " + "!";
    }
}
