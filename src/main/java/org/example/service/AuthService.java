// 接口
package org.example.service;

public interface AuthService {
    void register(String username, String password);
    boolean login(String username, String password);
}

