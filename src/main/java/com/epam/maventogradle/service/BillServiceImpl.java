package com.epam.maventogradle.service;

import com.epam.maventogradle.model.Billionaire;
import com.epam.maventogradle.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    private final BillRepository repository;

    @Autowired
    public BillServiceImpl(BillRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Billionaire> findAll() {
        return repository.findAll();
    }
}
