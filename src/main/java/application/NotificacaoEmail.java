package application;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao implements Priorizavel, Arquivavel {
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

    @Override
    public int obterNivelPrioridade() {
        return this.nivelPrioridade;
    }

    public void definirPrioridade(int nivel) {
        if(nivel >= 1 && nivel <= 10) {
            this.nivelPrioridade = nivel;
            System.out.println("Prioridade Redefinida: " + this.nivelPrioridade);
        } else {
            System.out.println("Nivel de Prioridade Inválido (1-10)");
        }
    }
    @Override
    public boolean estaArquivado() {
        return this.estaArquivado;
    }

    @Override
    public void arquivar() {
        if(!this.estaArquivado) {
            this.estaArquivado = true;
            System.out.println("E-mail Arquivado");
        } else {
            System.out.println("E-mail ja está arquivado");
        }
    }
    @Override
    public void desarquivar() {
        if(estaArquivado) {
            this.estaArquivado = false;
            System.out.println("E-mail desarquivado");
        } else {
            System.out.println("E-mail não está arquivado");
        }
    }
}