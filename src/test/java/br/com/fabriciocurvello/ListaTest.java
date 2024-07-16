package br.com.fabriciocurvello;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTest {

    @Mock
    private List<String> letras;

    @Test
    public void adicionarItemNaLista() {
        //Mockito, quando letras no  indice 0 for acionado, retorne "A"
        Mockito.when(letras.getFirst()).thenReturn("A");

        //JUnit ao acionar letras no indice 0, verificar se o retorno esperado é "A"
        Assertions.assertEquals("A", letras.getFirst());
    }
}
