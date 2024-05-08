package com.example.demo.mock;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.User;
import com.example.demo.enums.InterfaceType;
import com.example.demo.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("mock-test")
public class UserRepositoryTest {

  @Value("${spring.datasource.interfacetype}")
  private InterfaceType type;

  public List<User> findUserAll() {
    List<User> users;
    switch (type) {
      case QA:
        users = new ArrayList<>(10);
        return Mockito.spy(users);
      case MOCK:
        users = new ArrayList<>(10);
        return (List<User>) Mockito.mock(users.getClass());
      default:
        return null;
    }
  }

  public User findUserById(String id) {

    return null;
  }

  public User createUser(User user) {

    return null;
  }

  public User updateUser(User user) {

    return null;
  }

  public void deleteUser(String id) {

  }
}
