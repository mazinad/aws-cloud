package com.aws.awscloudwatch.controllers;


import com.aws.awscloudwatch.models.UserSpecs;
import com.aws.awscloudwatch.repository.UserSpecsRepository;

import com.aws.awscloudwatch.security.services.UserSpecsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/userSpecs")
public class UserSpecsController {
    @Autowired
    private UserSpecsService userSpecsService;
    @Autowired
    private UserSpecsRepository userSpecsRepository;
    @RequestMapping(value = "/saveSpecs",method = RequestMethod.POST)
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public UserSpecs saveSpecs(@RequestBody UserSpecs userSpecs) {
        return userSpecsService.createUserSpecs(userSpecs);
    }
    @RequestMapping(value = "/getAllSpecs",method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<UserSpecs> getAllSpecs() {
        return userSpecsRepository.findAll();
    }
}
