package com.example.demo.Iservices;


import com.example.demo.model.Doctor;
import org.json.JSONObject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IDoctorRepository  extends MongoRepository<Doctor, String> {



}
