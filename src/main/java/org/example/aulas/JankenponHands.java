package org.example.aulas;

public enum JankenponHands {
    PEDRA(1),
    PAPEL(2),
    TESOURA(3);

    public final int code;

    JankenponHands(int code) {
        this.code = code;
    }

    public static JankenponHands fromCode(int input) {
        JankenponHands[] values = JankenponHands.values();

        for (JankenponHands value : values) {
            if (input == value.code) {
                return value;
            }
        }
        return null;
    }
}
