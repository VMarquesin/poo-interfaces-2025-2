package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notiSMS = new NotificacaoSms(
            "Marcos", "1451351", "Msg de teste", 1);
    
    notiSMS.exibirInformacoesRemetente();
    notiSMS.enviar();
    notiSMS.registrarLog();

    notiSMS.definirPrioridade(8);
    notiSMS.obterNivelPrioridade();
    notiSMS.definirPrioridade(0);
    }
}

