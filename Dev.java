import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Bootcamp> bootcampsInscritos;
    private List<Conteudo> conteudosConcluidos;
    private int xp;

    public Dev() {
        this.bootcampsInscritos = new ArrayList<>();
        this.conteudosConcluidos = new ArrayList<>();
        this.xp = 0;
    }

    public Dev(String string) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        List<Conteudo> conteudos = new ArrayList<>();
        for (Bootcamp bootcamp : bootcampsInscritos) {
            conteudos.addAll(bootcamp.getConteudos());
        }
        return conteudos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public int calcularTotalXp() {
        return xp;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.add(bootcamp);
    }

    public void progredir() {
        for (Bootcamp bootcamp : bootcampsInscritos) {
            for (Conteudo conteudo : bootcamp.getConteudos()) {
                boolean jaConcluido = conteudosConcluidos.contains(conteudo);
                if (!jaConcluido) {
                    conteudosConcluidos.add(conteudo);
                    xp += 10; // Exemplo de XP ganho ao concluir um conteúdo
                }
            }
        }
    }
}
