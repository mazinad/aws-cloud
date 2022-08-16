package com.aws.awscloudwatch.security.services;


import com.aws.awscloudwatch.models.UserSpecs;
import com.aws.awscloudwatch.repository.UserSpecsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSpecsService {
    @Autowired
    private UserSpecsRepository userSpecsRepository;

    public UserSpecs createUserSpecs(UserSpecs userSpecs) {
        return userSpecsRepository.save(userSpecs);
    }
}
