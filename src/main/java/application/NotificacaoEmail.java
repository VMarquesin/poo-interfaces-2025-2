package application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao {
    private String destinatario;
    private String assunto;
    private String corpo;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int nivelPrioridade;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private boolean estaArquivado;

    public NotificacaoEmail(
            String remetente, String destinatario, String assunto,
            String corpo, int prioridade // <-- PARÂMETRO
    ) {
        super (remetente);
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
        this.nivelPrioridade = prioridade; // <-- CORREÇÃO 1
        this.estaArquivado = false;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail (Prioridade " +
        this.nivelPrioridade + ") para " + this.destinatario);
    }

    @Override
    public void registrarLog() {
        // CORREÇÃO 2
        System.out.println("Log E-mail (Prioridade " + 
        this.nivelPrioridade + ") para " + this.destinatario);
    }
}