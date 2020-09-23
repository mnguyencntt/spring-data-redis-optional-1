package com.anz.platform.redis;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "student", timeToLive = 60L)
public class RedisStudent implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  private String name;
  private String age;

  @JsonFormat(pattern = "dd-MMM-yyyy HH:mm:ss")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  private LocalDateTime creationTime;
}
