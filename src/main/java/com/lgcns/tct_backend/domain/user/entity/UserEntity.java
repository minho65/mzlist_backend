package com.lgcns.tct_backend.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "TB_USER")
@Entity
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @Column(name = "user_birthday")
    private LocalDateTime userBirthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderStatus gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "authority_code")
    private AuthorityCode authorityCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "use_yn")
    private UseStatus useYn;

}
