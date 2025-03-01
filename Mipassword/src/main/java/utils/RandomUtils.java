/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;

/**
 *
 * @author ROG STRIX
 */
public class RandomUtils {
     public static char getRandomChar(char start, char end) {
        Random random = new Random();
        return (char) (start + random.nextInt(end - start + 1));
    }

    public static char getRandomDigit() {
        return getRandomChar('0', '9');
    }

    public static char getRandomSpecialChar() {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();
        return specialChars.charAt(random.nextInt(specialChars.length()));
    }

    public static char getRandomCharFromPool() {
        String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();
        return pool.charAt(random.nextInt(pool.length()));
    }
}
