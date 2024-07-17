import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Conteudo> conteudos;

    public Bootcamp() {
        this.conteudos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }
}
