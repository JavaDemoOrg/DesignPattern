package com.abt.sample.builder_case;

/**
 * @描述： @User
 * @作者： @黄卫旗
 * @创建时间： @23/06/2018
 */
public class User {
    private final String mFirstName;
    private final String mLastName;
    private final String mGender;
    private final int mAge;
    private final String mPhoneNo;

    private User(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mGender = builder.mGender;
        mAge = builder.mAge;
        mPhoneNo = builder.mPhoneNo;
    }

    public static final class Builder {
        private String mFirstName;
        private String mLastName;
        private String mGender;
        private int mAge;
        private String mPhoneNo;

        public Builder(String firstName, String lastName) {
            this.mFirstName = firstName;
            this.mLastName = lastName;
        }

        public Builder gender(String val) {
            mGender = val;
            return this;
        }

        public Builder age(int val) {
            mAge = val;
            return this;
        }

        public Builder phone(String val) {
            mPhoneNo = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
