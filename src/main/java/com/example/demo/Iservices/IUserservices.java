package com.example.demo.Iservices;

import com.example.demo.model.ForgotPW;
import org.json.JSONObject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IUserservices  extends MongoRepository<ForgotPW, String> {

    ForgotPW findByStudentNumber(long studentNumber);

    ForgotPW findByEmail(String email);

    List<ForgotPW> findAllByOrderByGpa();

}
