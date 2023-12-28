package R.Tomokane;

import java.util.List;
import java.util.Objects;

public class Pessoas {

    private String nome;
    private String genero;
    private int idade;

    public Pessoas(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Pessoas() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoas> listaPessoaGP() {
        Pessoas pessoa1 = new Pessoas("Augusto", "Masculino", 20);
        Pessoas pessoa2 = new Pessoas("Gisele", "Feminino", 18);
        Pessoas pessoa3 = new Pessoas("Gabriel", "Masculino", 29);
        Pessoas pessoa4 = new Pessoas("Andre", "Masculino", 20);
        Pessoas pessoa5 = new Pessoas("Nicole", "Feminino", 25);
        Pessoas pessoa6 = new Pessoas("lais", "Feminino", 19);

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        Pessoas pessoa = (Pessoas) o;
        return nome.equals(pessoa.nome) && genero.equals(pessoa.genero);
    }

    public int hashcode(){
        return Objects.hash(genero,nome);
    }

    @Override
    public String toString() {
        return "Pessoas {" +
                "nome = " + nome + '\'' +
                ", genero = " + genero +
                '}';
    }
}
