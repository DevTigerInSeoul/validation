package com.devtiger.validation.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {

    String email;

    String password;

    String nickname;
}
