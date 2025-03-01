/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generator;

/**
 *
 * @author ROG STRIX
 */
import dto.PasswordConfigDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class PasswordGenerator {

    // Versión 1: Generar contraseña con requisitos predeterminados
    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("La longitud mínima debe ser al menos 8 caracteres.");
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Asegurar al menos un carácter de cada tipo
        password.append(getRandomChar('a', 'z')); // Letra minúscula
        password.append(getRandomChar('A', 'Z')); // Letra mayúscula
        password.append(getRandomDigit());       // Dígito
        password.append(getRandomSpecialChar()); // Carácter especial

        // Completar el resto de la contraseña
        for (int i = 4; i < length; i++) {
            password.append(getRandomCharFromPool());
        }

        // Mezclar los caracteres para evitar patrones predecibles
        return shuffleString(password.toString());
    }

    // Versión 2: Generar contraseña configurable
    public static String generatePassword(PasswordConfigDTO config) {
        int minLength = Math.max(config.getMinLength(), 8); // Asegurar longitud mínima de 8
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Añadir dígitos si está restringido
        if (config.isRestrictMinDigits()) {
            for (int i = 0; i < config.getMinDigits(); i++) {
                password.append(getRandomDigit());
            }
        }

        // Añadir letras mayúsculas si está restringido
        if (config.isRestrictMinUpperCaseLetters()) {
            for (int i = 0; i < config.getMinUpperCaseLetters(); i++) {
                password.append(getRandomChar('A', 'Z'));
            }
        }

        // Añadir letras minúsculas si está restringido
        if (config.isRestrictMinLowerCaseLetters()) {
            for (int i = 0; i < config.getMinLowerCaseLetters(); i++) {
                password.append(getRandomChar('a', 'z'));
            }
        }

        // Añadir caracteres especiales si está restringido
        if (config.isRestrictMinNonAlphanumericCharacters()) {
            for (int i = 0; i < config.getMinNonAlphanumericCharacters(); i++) {
                password.append(getRandomSpecialChar());
            }
        }

        // Completar el resto de la contraseña
        while (password.length() < minLength) {
            password.append(getRandomCharFromPool());
        }

        // Mezclar los caracteres para evitar patrones predecibles
        return shuffleString(password.toString());
    }

    // Métodos auxiliares
    private static char getRandomChar(char start, char end) {
        Random random = new Random();
        return (char) (start + random.nextInt(end - start + 1));
    }

    private static char getRandomDigit() {
        return getRandomChar('0', '9');
    }

    private static char getRandomSpecialChar() {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();
        return specialChars.charAt(random.nextInt(specialChars.length()));
    }

    private static char getRandomCharFromPool() {
        String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();
        return pool.charAt(random.nextInt(pool.length()));
    }

    private static String shuffleString(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder shuffled = new StringBuilder();
        for (char c : characters) {
            shuffled.append(c);
        }
        return shuffled.toString();
    }
}