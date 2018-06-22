package com.abt.sample.builder_case;

/**
 * @描述： @DoUser
 * @作者： @黄卫旗
 * @创建时间： @23/06/2018
 */
public class DoUser {

    public User getUser() {

        return new User.Builder("firstName", "lastName")
                .gender("male")
                .age(11)
                .phone("1233123123")
                .build();
    }
}
