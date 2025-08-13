package com.alura.Demo.domain.topico;

import java.time.LocalDateTime;

public record TopicoListagemDTO(Long id, String titulo, String mensagem, LocalDateTime data, Status status, String autor, String curso) {
    public TopicoListagemDTO(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
