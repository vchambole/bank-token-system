package com.bank.service;

import com.bank.entity.CustomerToken;
import com.bank.entity.ServiceCounter;

import java.util.List;

public interface ServiceCounterService {

    List<ServiceCounter> getServiceCounterList();
    List<CustomerToken> getTokensForServiceCounter(String serviceType);
}
