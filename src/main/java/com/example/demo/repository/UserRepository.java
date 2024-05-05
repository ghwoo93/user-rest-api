package com.example.demo.repository;

import com.example.demo.dto.User;
import com.example.demo.enums.InterfaceType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Value("${spring.datasource.interfacetype}")
    private InterfaceType type;

    public List<User> findUserAll() {
        switch (type) {
            case MOCK:
                // Handle MOCK interface type
                break;
            case QA:
                // Handle QA interface type
                break;
            case PROD:
                // Handle PROD interface type
                break;
            default:
                // Handle unknown interface type
                break;
        }
        return null;
    }

    public User findUserById(String id) {
        switch (type) {
            case MOCK:
                // Handle MOCK interface type
                break;
            case QA:
                // Handle QA interface type
                break;
            case PROD:
                // Handle PROD interface type
                break;
            default:
                // Handle unknown interface type
                break;
        }
        return null;
    }

    public User createUser(User user) {
        switch (type) {
            case MOCK:
                // Handle MOCK interface type
                break;
            case QA:
                // Handle QA interface type
                break;
            case PROD:
                // Handle PROD interface type
                break;
            default:
                // Handle unknown interface type
                break;
        }
        return null;
    }


    public User updateUser(User user) {
        switch (type) {
            case MOCK:
                // Handle MOCK interface type
                break;
            case QA:
                // Handle QA interface type
                break;
            case PROD:
                // Handle PROD interface type
                break;
            default:
                // Handle unknown interface type
                break;
        }
        return null;
    }

    public void deleteUser(String id) {
        switch (type) {
            case MOCK:
                // Handle MOCK interface type
                break;
            case QA:
                // Handle QA interface type
                break;
            case PROD:
                // Handle PROD interface type
                break;
            default:
                // Handle unknown interface type
                break;
        }
    }
}
