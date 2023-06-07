package com.example.demo.account.controller.form;

import com.example.demo.account.entity.RoleType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccountLoginRequestForm {

    private String email;
    private String password;
    private RoleType roleType;

}