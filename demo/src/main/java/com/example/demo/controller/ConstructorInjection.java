package com.example.demo.controller;


import com.example.demo.service.InjectService;

public class ConstructorInjection {

    private InjectService injectService;

    //constructor injection, you wont even have to write Autowired or anything here. spring will automatically attach the object here.
    public ConstructorInjection(InjectService injectService){
        this.injectService = injectService;
    }
// more reliable way for injecting dependencies.
    //instantiation followed by injection.
}
