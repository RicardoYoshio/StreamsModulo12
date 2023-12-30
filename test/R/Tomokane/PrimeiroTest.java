package R.Tomokane;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PrimeiroTest {

    @Test
    public void Primeiroteste() {

        List<Pessoas> listPessoa = new Pessoas().listaPessoaGP();
        List<Pessoas> mulheres = listPessoa.stream()
                .filter(pessoas -> pessoas.getGenero().equals("Feminino"))
                .collect(Collectors.toList());

        for (Pessoas mulher : mulheres) {
            Assert.assertEquals("Feminino",mulher.getGenero());

        }
    }
}
