package com.alura.Demo.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record TopicoCadastroDTO(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {
}
