package com.example.demo.controller;

import com.example.demo.service.InjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class FieldInjection {

    @Autowired
    private InjectService injectService;//this is field injection.

    //spring uses reflection API for injection.

}
