package com.devtiger.validation.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SignUpRequestDto {

    @NotEmpty
    String email;

    @NotEmpty
    String password;

    @NotEmpty
    String nickname;
}
