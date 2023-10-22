import java.util.HashMap;
import java.util.Map;

class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}

class DiscadorTelefonico {
    private Map<String, Contato> agenda;

    public DiscadorTelefonico() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        agenda.put(numero, contato);
    }

    public void fazerChamada(String numero) {
        Contato contato = agenda.get(numero);
        if (contato != null) {
            System.out.println("Chamando " + contato.getNome() + " (" + contato.getNumero() + ")");
        } else {
            System.out.println("Número não encontrado na agenda.");
        }
    }
}

public class ExemploDiscadorTelefonico {
    public static void main(String[] args) {
        DiscadorTelefonico discador = new DiscadorTelefonico();

        discador.adicionarContato("João", "123456789");
        discador.adicionarContato("Maria", "987654321");

        discador.fazerChamada("123456789");
        discador.fazerChamada("999999999");
    }
}
