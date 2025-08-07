package com.mynmy.springbackend.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private final String provider; // 소셜 로그인 ex. google
    private final String providerId; // 구글 userId
    private final String name;
    private final String email;

    @Builder
    public User(String provider, String providerId, String name, String email) {
        this.id = null; // DB에서 자동 생성
        this.provider = provider;
        this.providerId = providerId;
        this.name = name;
        this.email = email;
    }

}
