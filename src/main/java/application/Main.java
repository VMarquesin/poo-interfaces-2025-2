package application;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

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

    objPriorizavel = new NotificacaoEmail(
        "Beltrano", "Beltra@email.com", "teste", "Olá Mundo", 3);
    
        Arquivavel objArquivavel = new NotificacaoEmail(
            "Marcos", "MARCO@GZIPInputStream", "NEW Test", "ola", 3);

        ((Notificacao) objArquivavel).enviar();

        System.out.println("=======");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);
        objetos.add(new NotificacaoSms(
        "Russo", "1321351", "New Test", 2));
        objetos.add(new NotificacaoSms(
        "Russiani", "13115351", "Test", 4));

        for(Priorizavel item : objetos) {
            System.out.println(item.obterNivelPrioridade());
        }
    }
}

