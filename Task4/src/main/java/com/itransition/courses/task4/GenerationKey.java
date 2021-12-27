package com.itransition.courses.task4;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

public class GenerationKey {
    public String hmac(String message, String key)  {
        return DigestUtils.sha256Hex(message + key).toUpperCase();
    }
    public String hmacKey() {
        return DigestUtils.sha256Hex(new Random().nextInt(100) + "").toUpperCase();
    }
}