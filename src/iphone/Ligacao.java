package iphone;

import java.util.ArrayList;
import java.util.List;

public class Ligacao {


    private List<String> agenda;

    public Ligacao(){
        agenda = new ArrayList<>();
    }

    public void adicionarNumero(String numero) {
        this.agenda.add(numero);
    }
    public void listaAgenda(){
        for(String numeros : agenda){
            System.out.println(numeros);
        }
    }

    public void ligacao(){
        System.out.println("Alerta - Sem Aria...");
    }
}
