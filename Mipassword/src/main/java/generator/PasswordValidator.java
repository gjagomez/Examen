package generator;

import dto.PasswordConfigDTO;

public class PasswordValidator {

    /**
     * Valida si una contraseña cumple con las políticas especificadas en el objeto PasswordConfigDTO.
     *
     * @param password La contraseña a validar.
     * @param config   El objeto que contiene las configuraciones de las políticas de contraseña.
     * @return true si la contraseña cumple con todas las políticas, false en caso contrario.
     */
    public static boolean validate(String password, PasswordConfigDTO config) {
        // Validar longitud mínima
        if (password.length() < config.getMinLength()) {
            return false;
        }

        // Validar cantidad mínima de dígitos
        if (config.isRestrictMinDigits() && countDigits(password) < config.getMinDigits()) {
            return false;
        }

        // Validar cantidad mínima de letras mayúsculas
        if (config.isRestrictMinUpperCaseLetters() && countUpperCaseLetters(password) < config.getMinUpperCaseLetters()) {
            return false;
        }

        // Validar cantidad mínima de letras minúsculas
        if (config.isRestrictMinLowerCaseLetters() && countLowerCaseLetters(password) < config.getMinLowerCaseLetters()) {
            return false;
        }

        // Validar cantidad mínima de caracteres especiales
        if (config.isRestrictMinNonAlphanumericCharacters() && countSpecialCharacters(password) < config.getMinNonAlphanumericCharacters()) {
            return false;
        }

        // Si pasa todas las validaciones, la contraseña es válida
        return true;
    }

    /**
     * Cuenta la cantidad de dígitos en una cadena.
     *
     * @param password La contraseña a analizar.
     * @return El número de dígitos en la contraseña.
     */
    private static int countDigits(String password) {
        return (int) password.chars()
                             .filter(Character::isDigit)
                             .count();
    }

    /**
     * Cuenta la cantidad de letras mayúsculas en una cadena.
     *
     * @param password La contraseña a analizar.
     * @return El número de letras mayúsculas en la contraseña.
     */
    private static int countUpperCaseLetters(String password) {
        return (int) password.chars()
                             .filter(Character::isUpperCase)
                             .count();
    }

    /**
     * Cuenta la cantidad de letras minúsculas en una cadena.
     *
     * @param password La contraseña a analizar.
     * @return El número de letras minúsculas en la contraseña.
     */
    private static int countLowerCaseLetters(String password) {
        return (int) password.chars()
                             .filter(Character::isLowerCase)
                             .count();
    }

    /**
     * Cuenta la cantidad de caracteres especiales en una cadena.
     *
     * @param password La contraseña a analizar.
     * @return El número de caracteres especiales en la contraseña.
     */
    private static int countSpecialCharacters(String password) {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        return (int) password.chars()
                             .filter(c -> specialChars.indexOf(c) != -1)
                             .count();
    }
}