package com.anz.platform.redis;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedisStudentRepository extends JpaRepository<RedisStudent, String> {
  Optional<RedisStudent> findById(String id);
}
