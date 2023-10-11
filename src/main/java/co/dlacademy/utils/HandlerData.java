package co.dlacademy.utils;

public class HandlerData {
    public static double convertirStringDobleSinSigno(String valor) {
        String valorSinSigno;
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("El string es inválido.");
        }

        valorSinSigno = valor.replace("$", "").trim();

        try {
            return Double.parseDouble(valorSinSigno);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El string no tiene un formato válido.", e);
        }
    }
}

