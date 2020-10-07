package com.epam.maventogradle.service;

import com.epam.maventogradle.model.Billionaire;

import java.util.List;

public interface BillService {
    List<Billionaire> findAll();
}
