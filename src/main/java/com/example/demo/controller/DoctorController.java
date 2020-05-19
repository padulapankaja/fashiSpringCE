package com.example.demo.controller;

import com.example.demo.Iservices.IDoctorRepository;
import com.example.demo.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private IDoctorRepository doctorRepository;

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity  update(@RequestBody Doctor doctor){

        System.out.println("Doctor");
        System.out.println(doctor);
        System.out.println(doctor.getEmail());
        System.out.println(doctor.getId());
        System.out.println(doctor.getName());
        this.doctorRepository.save(doctor);




        return   ResponseEntity.status(200).body(doctor);
    }


}
