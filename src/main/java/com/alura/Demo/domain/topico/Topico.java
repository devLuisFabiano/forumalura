package com.alura.Demo.domain.topico;

import com.alura.Demo.domain.resposta.Resposta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime data;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String curso;
    private String autor;
    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Resposta> respostas;

    public Topico(TopicoCadastroDTO dados){
        this.curso = dados.curso();
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.data = LocalDateTime.now();
        this.status = Status.PENDENTE;
    }

    public void atualizarInformacoes(TopicoAtualizacaoDTO dados) {
        this.mensagem = dados.mensagem();
    }
}
