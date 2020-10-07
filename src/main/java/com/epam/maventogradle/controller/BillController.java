package com.epam.maventogradle.controller;

import com.epam.maventogradle.model.Billionaire;
import com.epam.maventogradle.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillController {

    private BillService service;

    @Autowired
    public BillController(BillService service) {
        this.service = service;
    }

    @GetMapping("/billionaire")
    public List<Billionaire> findAll() {
        return service.findAll();
    }
}
