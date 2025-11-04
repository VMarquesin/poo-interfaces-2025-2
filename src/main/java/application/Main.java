package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notiSMS = new NotificacaoSms(
            "Marcos", "1451351", "Msg de teste", 1);
    
    notiSMS.exibirInformacoesRemetente();
    notiSMS.enviar();
    notiSMS.registrarLog();

    notiSMS.definirPrioridade(8);
    System.out.println(notiSMS.obterNivelPrioridade());
    notiSMS.definirPrioridade(0);

    Notificacao notif = new NotificacaoSms(
        "Fulano", "156165165", "Oush", 3);

    notif.exibirInformacoesRemetente();
    notif.enviar();

    Priorizavel objPriorizavel = new NotificacaoSms(
        "Russo", "1321351", "New Test", 2);
    
    objPriorizavel.definirPrioridade(6);

    }
}

