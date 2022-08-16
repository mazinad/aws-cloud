package com.aws.awscloudwatch.repository;

import com.aws.awscloudwatch.models.ERole;
import com.aws.awscloudwatch.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
