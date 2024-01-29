package com.flowershop.app.model;

import com.flowershop.app.entity.Biodata;
import com.flowershop.app.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateUserRequest {
    User users;
    Biodata biodata;
}
