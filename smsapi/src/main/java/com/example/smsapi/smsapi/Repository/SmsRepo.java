package com.example.smsapi.smsapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smsapi.smsapi.Model.Smsbean;

public interface SmsRepo extends JpaRepository<Smsbean,Long> {

}
