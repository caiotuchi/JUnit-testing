import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class PessoaTest {
    
    @Test //1.1
    public void testSetNomeComposto() throws Exception{
        Pessoa caio = new Pessoa("Caio Cezar", 24);
        assertEquals("Caio Cezar", caio.getNome());
    }
    @Test //1.2
    public void testSetNomeNaoComposto() throws Exception{
        Exception composto = assertThrows(Exception.class, () -> { 
            Pessoa marcos = new Pessoa("Marcos", 23); 
        });
        assertEquals("Deve ser informado o sobrenome", composto.getMessage());
    }
    @Test //2.1
    public void testSetNomeMinimo() throws Exception{
        Pessoa maria = new Pessoa("Maria Eduarda", 20);
        assertEquals("Maria Eduarda", maria.getNome());
    }
    @Test //2.2
    public void testSetNomeNaoMinimo() throws Exception{
        Exception minimo = assertThrows(Exception.class, () -> { 
            Pessoa ei = new Pessoa("Ei Ra", 23); 
        });
        assertEquals("Nome e sobrenome devem possuir mais do que 5 caracteres", minimo.getMessage());
    }
    @Test //3.1
    public void testSetNomeSemEspecial() throws Exception{
        Pessoa ariel = new Pessoa("Ariel Ramos", 20);
        assertEquals("Ariel Ramos", ariel.getNome());
    }
    @Test //3.2
    public void testSetNomeComEspecial() throws Exception{
        Exception especial = assertThrows(Exception.class, () -> { 
            Pessoa ana = new Pessoa("Ana Ros4", 23); 
        });
        assertEquals("Caracter inválido encontrado!", especial.getMessage());
    }
    @Test //4.1 limite válido
    public void testSetIdadeLimiteInferiorValido() throws Exception{
        Pessoa rosalia = new Pessoa("La Rosalia", 0);
        assertEquals("La Rosalia", rosalia.getNome());
    }
    @Test //4.1 limite inválido
    public void testSetIdadeLimiteInferiorInvalido() throws Exception{
        Exception negativa = assertThrows(Exception.class, () -> { 
            Pessoa vera = new Pessoa("Ana Vera", -1); 
        });
        assertEquals("Idade não pode ser negativa", negativa.getMessage());
    }
    @Test //4.2 limite válido
    public void testSetIdadeLimiteSuperiorValido() throws Exception{    
        Pessoa joao = new Pessoa("João Eduardo", 100);
        assertEquals("João Eduardo", joao.getNome());
    }
    @Test //4.2 limite inválido
    public void testSetIdadeLimiteSuperiorInvalido() throws Exception{
        Exception maior = assertThrows(Exception.class, () -> { 
            Pessoa beyonce = new Pessoa("Beyonce Knowles", 101); 
        });
        assertEquals("Idade não pode ser maior que 100", maior.getMessage());
    }

}
