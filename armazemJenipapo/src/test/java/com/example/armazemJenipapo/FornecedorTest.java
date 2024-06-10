package com.example.armazemJenipapo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FornecedorTest {

    private Fornecedor fornecedor;

    @BeforeEach
    public void setUp() {
        fornecedor = new Fornecedor(1, "Fornecedor Teste", 123456789, "Rua Teste", "Bairro Teste",
                "Cidade Teste", "Estado Teste", 12345, "Telefone Teste", "email@teste.com",
                "01/01/2022", "10/10/1980");
    }
    @Test
    public void testGetIdFornecedor() {
        assertEquals(1, fornecedor.getIdFornecedor(), "O ID do fornecedor deve ser igual a 1.");
        System.out.println("Teste do ID do fornecedor bem-sucedido!");
    }
    @Test
    public void testGetCnpj() {
        assertEquals(123456789, fornecedor.getCnpj(), "O CNPJ do fornecedor deve ser igual a 123456789.");
        System.out.println("Teste do CNPJ do fornecedor bem-sucedido!");
    }
    @Test
    public void testGetDataCadastro() {
        assertEquals("01/01/2022", fornecedor.getDataCadastro(), "A data de cadastro do fornecedor deve ser igual a 01/01/2022.");
        System.out.println("Teste da data de cadastro do fornecedor bem-sucedido!");
    }
}
