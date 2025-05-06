package edu.dio.UserPixDTO; // Mude para um pacote "dto" (boas práticas)

public class PixDTO {
    private final String userName; // Tornamos imutável (final)
    private final String pixKey;

    // Construtor direto com os valores necessários
    public PixDTO(String userName, String pixKey) {
        this.userName = userName;
        this.pixKey = pixKey;
    }


    public String getUserName() {
        return userName;
    }

    public String getPixKey() {
        return pixKey;
    }
}
