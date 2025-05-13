import java.util.Objects;

public class Aluno {
    private String nome;

    public Aluno(String aluno) {
        this.nome = aluno;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {

        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
