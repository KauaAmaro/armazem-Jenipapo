package com.example.armazemJenipapo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    private Produto produto;

    @BeforeEach
    public void setUp() {
        Fornecedor fornecedor = new Fornecedor(1, "Fornecedor Teste", 123456789, "Rua Teste", "Bairro Teste",
                "Cidade Teste", "Estado Teste", 12345, "Telefone Teste", "email@teste.com",
                "01/01/2022", "10/10/1980");
        produto = new Produto(1, 987654321, "Produto Teste", "Descrição Teste", fornecedor, "02/02/2022");
    }

    @Test
    public void testGetId() {
        assertEquals(1, produto.getId(), "O ID do produto deve ser igual a 1.");
        System.out.println("Teste do ID do produto bem-sucedido!");
    }

    @Test
    public void testGetCodigoBarras() {
        assertEquals(987654321, produto.getCodigoBarras(), "O código de barras do produto deve ser igual a 987654321.");
        System.out.println("Teste do código de barras do produto bem-sucedido!");
    }

    @Test
    public void testGetNome() {
        assertEquals("Produto Teste", produto.getNome(), "O nome do produto deve ser igual a \"Produto Teste\".");
        System.out.println("Teste do nome do produto bem-sucedido!");
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Descrição Teste", produto.getDescricao(), "A descrição do produto deve ser igual a \"Descrição Teste\".");
        System.out.println("Teste da descrição do produto bem-sucedido!");
    }

    @Test
    public void testGetNomeFornecedor() {
        assertEquals("Fornecedor Teste", produto.getNomeFornecedor(), "O nome do fornecedor do produto deve ser igual a \"Fornecedor Teste\".");
        System.out.println("Teste do nome do fornecedor do produto bem-sucedido!");
    }

    @Test
    public void testGetDataCadastro() {
        assertEquals("02/02/2022", produto.getDataCadastro(), "A data de cadastro do produto deve ser igual a \"02/02/2022\".");
        System.out.println("Teste da data de cadastro do produto bem-sucedido!");
    }
}
