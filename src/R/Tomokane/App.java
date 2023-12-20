package R.Tomokane;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Pessoas> listPessoas = new Pessoas().listaPessoaGP();
        System.out.println("Grupo Masculino; ");
        List<Pessoas> listMain = listPessoas.stream()
                .filter(pessoas ->  pessoas.getGenero().equals("Masculino"))
                .collect(Collectors.toList());

        listMain.forEach(System.out::println);

        System.out.println("---------");
        System.out.println("---------");
        System.out.println("---------");

        System.out.println("Grupo Feminino");
        listPessoas.stream()
                .filter(pessoas ->  pessoas.getGenero().equals("Feminino"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
