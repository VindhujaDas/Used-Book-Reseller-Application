/*
 * Copyright (C) 2018 by Teradata Corporation.
 * All Rights Reserved.
 * TERADATA CORPORATION CONFIDENTIAL AND TRADE SECRET
 */
package com.example.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookstore.domain.Payment;

/**
 * @author ss186235
 * @version $Id: $
 */
public interface PaymentRepository extends CrudRepository<Payment, Long>{

}

