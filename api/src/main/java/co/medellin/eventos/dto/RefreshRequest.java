package co.medellin.eventos.dto;

import jakarta.validation.constraints.NotBlank;

public class RefreshRequest {
    @NotBlank
    private String refreshToken;

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
}
