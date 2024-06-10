package com.example.armazemJenipapo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

@SpringBootApplication
public class ArmazemJenipapoApplication {

/*	public static void main(String[] args) {
		SpringApplication.run(ArmazemJenipapoApplication.class, args);
	} */

	static ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	static ArrayList<Estoque> listaEstoques = new ArrayList<Estoque>();

	public static void cadastrarFornecedor() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int numeroId = rand.nextInt(100);

		System.out.println("Vamos cadastrar um novo Fornecedor");
		System.out.println("Digite o nome do Fornecedor:");
		String nome = sc.next();

		System.out.println("Digite o CNPJ:");
		int cnpj = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite o Logradouro:");
		String logradouro = sc.nextLine();

		System.out.println("Digite o Bairro:");
		String bairro = sc.nextLine();

		System.out.println("Digite a Cidade:");
		String cidade = sc.nextLine();
		sc.nextLine();

		System.out.println("Digite o Estado:");
		String estado = sc.next();

		System.out.println("Digite o CEP:");
		int cep = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite seu Telefone:");
		String telefone = sc.nextLine();
		sc.nextLine();

		System.out.println("Digite seu Email:");
		String email = sc.next();

		System.out.println("Digite a data do Cadastro:");
		String dataCadastro = sc.next();

		System.out.println("Digite sua data de Nascimento:");
		String dataNascimento = sc.next();

		Fornecedor forn = new Fornecedor(numeroId, nome, cnpj, logradouro, bairro, cidade, estado, cep, telefone, email, dataCadastro, dataNascimento);

		listaFornecedores.add(forn);
	}

	public static void listarFornecedores() {

		for (int i = 0 ; i < listaFornecedores.size(); i++) {

			int id = listaFornecedores.get(i).getIdFornecedor();
			String nome = listaFornecedores.get(i).getNome();
			int cnpj = listaFornecedores.get(i).getCnpj();
			String logradouro = listaFornecedores.get(i).getLogradouro();
			String bairro = listaFornecedores.get(i).getBairro();
			String cidade = listaFornecedores.get(i).getCidade();
			String estado = listaFornecedores.get(i).getEstado();
			int cep = listaFornecedores.get(i).getCep();
			String telefone = listaFornecedores.get(i).getTelefone();
			String email = listaFornecedores.get(i).getEmail();
			String dataCadastro = listaFornecedores.get(i).getDataCadastro();
			String dataNascimento = listaFornecedores.get(i).getDataNascimento();


			System.out.println("Fornecedor encontrado:");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("ID = " + id + "| NOME = " + nome + "| CNPJ = " + cnpj + "| LOGRADOURO = " + logradouro + "| BAIRRO = " + bairro + "| CIDADE = " + cidade + "| ESTADO = " + estado + "| CEP = " + cep +
					"| TELEFONE = " + telefone + "| EMAIL = " + email + "| DATA DE CADASTRO = " + dataCadastro + "| DATA DE NASCIMENTO = " + dataNascimento );
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	public static void buscarFornecedorNome() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Buscar Fornecedor por nome");
		System.out.println("Qual é o nome do Fornecedor?");
		String nomeFornecedor = sc.next();

		for (int i =0 ; i < listaFornecedores.size(); i++) {

			String nomeForn = listaFornecedores.get(i).getNome();

			if (nomeFornecedor.equals(nomeForn)) {

				int id = listaFornecedores.get(i).getIdFornecedor();
				String nome = listaFornecedores.get(i).getNome();
				int cnpj = listaFornecedores.get(i).getCnpj();
				String logradouro = listaFornecedores.get(i).getLogradouro();
				String bairro = listaFornecedores.get(i).getBairro();
				String cidade = listaFornecedores.get(i).getCidade();
				String estado = listaFornecedores.get(i).getEstado();
				int cep = listaFornecedores.get(i).getCep();
				String telefone = listaFornecedores.get(i).getTelefone();
				String email = listaFornecedores.get(i).getEmail();
				String dataCadastro = listaFornecedores.get(i).getDataCadastro();
				String dataNascimento = listaFornecedores.get(i).getDataNascimento();

				System.out.println("O Fornecedor encontrado foi:");
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("ID = " + id + "| NOME = " + nome + "| CNPJ = " + cnpj + "| LOGRADOURO = " + logradouro + "| BAIRRO = " + bairro + "| CIDADE = " + cidade + "| ESTADO = " + estado + "| CEP = " + cep +
						"| TELEFONE = " + telefone + "| EMAIL = " + email + "| DATA DE CADASTRO = " + dataCadastro + "| DATA DE NASCIMENTO = " + dataNascimento );
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}}}

	public static void deletarFornecedor() {

		Scanner sc = new Scanner(System.in);

		System.out.println("DELETAR FORNECEDOR POR NOME");
		System.out.println("Qual é o nome do Fornecedor?");
		String nomeFornecedor = sc.next();

		for (int i =0 ; i < listaFornecedores.size(); i++) {

			String nomeForn = listaFornecedores.get(i).getNome();

			if (nomeFornecedor.equals(nomeForn)) {
				listaFornecedores.remove(i);
				System.out.println("Fornecedor: " + nomeForn + " deletado com sucesso!!");
			}
		}}

	public static void cadastrarProduto() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int numeroId = rand.nextInt(100);

		int codigoBarras = rand.nextInt(99999);

		System.out.println("Vamos cadastrar um novo Produto:");

		System.out.println("Fornecedores Disponiveis: ");
		for (int i =0 ; i < listaFornecedores.size(); i++) {
			String nomeForn = listaFornecedores.get(i).getNome();
			System.out.println(nomeForn);
		}
		System.out.println("Digite o nome do Fornecedor disponivel:");
		String nomeForn = sc.next();

		Fornecedor forn = new Fornecedor();

		for (int i =0; i < listaFornecedores.size(); i++  ){
			if(nomeForn.equals(listaFornecedores.get(i).getNome())){
				forn = listaFornecedores.get(i);
			}
		}
		for (int i = 0; i < listaFornecedores.size(); i++) {
			String nomeFornAtual = listaFornecedores.get(i).getNome();

			if (nomeForn.equals(nomeFornAtual)) {

				boolean fornExistente = false;
				for (Produto produto : listaProdutos) {
					if (produto.getNomeFornecedor().equals(nomeForn)) {
						fornExistente = true;
						break;
					}

				}


				System.out.println("Digite o nome do Produto:");
				String nome = sc.next();
				sc.nextLine();

				System.out.println("Digite a descrição do Produto:");
				String descricao = sc.nextLine();


				System.out.println("Digite a data de Cadastro:");
				String dataCadastro = sc.nextLine();
				sc.nextLine();



				Produto prod = new Produto(numeroId, codigoBarras, nome, descricao, forn, dataCadastro);

				listaProdutos.add(prod);

			} else {
				System.out.println("Fornecedor não encontrado!!");
			}
		}


	}

	public static void listarProdutos() {


		for (int i =0 ; i < listaProdutos.size(); i++) {


			int numeroId = listaProdutos.get(i).getId();
			int codigoBarras = listaProdutos.get(i).getCodigoBarras();
			String nome = listaProdutos.get(i).getNome();
			String descricao = listaProdutos.get(i).getDescricao();
			String dataCadastro = listaProdutos.get(i).getDataCadastro();
			String nomeForn = listaProdutos.get(i).getNomeFornecedor();

			System.out.println("Produto disponível:");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("ID = " + numeroId + " | Código de barras = " + codigoBarras + " | Nome do Produto = " + nome + " | Descrição = " + descricao + " | Nome do Fornecedor = " + nomeForn + " | Data de cadastro = " + dataCadastro );
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	public static void removerProduto(){

		Scanner sc = new Scanner(System.in);

		System.out.println("REMOVER PRODUTO");
		System.out.println("Digite o nome do produto que deseja remover");
		String nome = sc.next();

		for (int i =0 ; i < listaProdutos.size(); i++) {

			String nomeProd = listaProdutos.get(i).getNome();

			if (nome.equals(nomeProd)) {
				listaProdutos.remove(i);
				System.out.println("Produto: " + nomeProd + " deletado com sucesso!!");
			}
		}}

	public static void buscarProdutoNome() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Buscar Produto por nome");
		System.out.println("Qual é o nome do Produto?");
		String nomeProduto = sc.next();

		for (int i =0 ; i < listaProdutos.size(); i++) {

			String nomeProd = listaProdutos.get(i).getNome();

			if (nomeProduto.equals(nomeProd)) {

				int id = listaProdutos.get(i).getId();
				int codigoBarras = listaProdutos.get(i).getCodigoBarras();
				String nome = listaProdutos.get(i).getNome();
				String descricao = listaProdutos.get(i).getDescricao();
				String nomeForn = listaProdutos.get(i).getNomeFornecedor();
				String dataCadastro = listaProdutos.get(i).getDataCadastro();

				System.out.println("O Produto encontrado:");
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("ID = " + id + "| CÓDIGO DE BARRAS = " + codigoBarras + "| NOME = " + nome + "| DESCRIÇÃO = " + descricao + "| FORNECEDOR = " + nomeForn + "| DATA DE CADASTRO = " + dataCadastro );
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}}}

	public static void atualizarEstoque() {
		Scanner ce = new Scanner(System.in);

		System.out.println("Produtos Disponiveis:");
		for (int i =0 ; i < listaProdutos.size(); i++) {
			String nomeProd = listaProdutos.get(i).getNome();
			System.out.println(nomeProd);
		}

		System.out.println("Digite o nome do produto que deseja atualizar");
		String nomeProduto = ce.next();

		Produto produto = new Produto();

		for (int i =0; i < listaProdutos.size(); i++  ){
			if(nomeProduto.equals(listaProdutos.get(i).getNome())){
				produto = listaProdutos.get(i);
			}
		}
		for (int i = 0; i < listaProdutos.size(); i++) {
			String nomeProdutoAtual = listaProdutos.get(i).getNome();

			if (nomeProduto.equals(nomeProdutoAtual)) {
				System.out.println("Digite a quantidade que deseja adicionar:");
				int quantidade = ce.nextInt();


				boolean produtoExistente = false;
				for (Estoque estoque : listaEstoques) {
					if (estoque.getNomeProduto().equals(nomeProduto)) {
						estoque.adicionarQuantidade(quantidade);
						produtoExistente = true;
						break;
					}
				}
				if (!produtoExistente) {
					Estoque novoEstoque = new Estoque(produto, quantidade);
					listaEstoques.add(novoEstoque);
				}

				System.out.println("Estoque atualizado com sucesso!");

			}
		}

		System.out.println("Produto não encontrado.");
	}

	public static void RemoverEstoque() {

		Scanner ce = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Produtos Disponiveis:");
		for (int i =0 ; i < listaProdutos.size(); i++) {
			String nomeProd = listaProdutos.get(i).getNome();
			System.out.println(nomeProd);
		}

		System.out.println("Digite o nome do produto que deseja remover:");
		String nomeProduto = ce.next();

		for (int i = 0; i < listaProdutos.size(); i++) {
			String nomeProdutoAtual = listaProdutos.get(i).getNome();

			if (nomeProduto.equals(nomeProdutoAtual)) {
				System.out.println("Digite a quantidade que deseja remover:");
				int quantidade = ce.nextInt();


				boolean produtoExistente = false;
				for (Estoque estoque : listaEstoques) {
					if (estoque.getNomeProduto().equals(nomeProduto)) {
						estoque.removerQuantidade(quantidade);
						produtoExistente = true;
						break;
					}
				}
				if (!produtoExistente) {
					Estoque novoEstoque = new Estoque(produto, quantidade);
					listaEstoques.add(novoEstoque);
				}

				System.out.println("Estoque atualizado com sucesso!");
				return;
			}
		}

		System.out.println("Produto não encontrado.");



	}

	public static void listarEstoque(){


		for (int i =0 ; i < listaEstoques.size(); i++) {

			String produto = listaEstoques.get(i).getNomeProduto();
			int qnt = listaEstoques.get(i).getQuantidade();


			System.out.println("Estoque disponível:");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Nome do Produto = " + produto + " | Quantidade = " + qnt);
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int h = 1;

		while (h != 0) {
			System.out.println("Bem Vindo ao Sistema de Armazenamento do Armazém Jenipapo\n");
			System.out.println("O que você deseja administar?");
			System.out.println("1.Estoque");
			System.out.println("2.Fornecedor");
			System.out.println("3.Produto");
			System.out.println("0.Sair");

			int numero = entrada.nextInt();
			h = numero;

			switch (numero) {

				case 1:
					int i = 1;
					while (i != 0) {
						System.out.println("Bem vindo à aba Estoque\n");
						System.out.println("Qual ação você deseja? Digite a opção desejada!");
						System.out.println("1.Atualizar Estoque");
						System.out.println("2.Remover Estoque");
						System.out.println("3.Listar produto em Estoque");
						System.out.println("0.Voltar ao menu");

						int numeroMenu = entrada.nextInt();

						switch (numeroMenu) {

							case 1:
								atualizarEstoque();
								break;

							case 2:
								RemoverEstoque();
								break;

							case 3:
								listarEstoque();
								break;

							case 0:
								i = 0;
								break;

							default:
								System.out.println("Digite uma opção válida (Entre 0 a 3)");
								break;


						}
					}
					break;

				case 2:
					i = 1;
					while (i != 0) {

						System.out.println("Bem vindo à aba Fornecedor\n");
						System.out.println("Qual ação você deseja? Digite a opção desejada!");
						System.out.println("1.Cadastrar Fornecedor");
						System.out.println("2.Deletar Fornecedor");
						System.out.println("3.Listar Fornecedor");
						System.out.println("4.Procurar Fornecedor por nome");
						System.out.println("0.Voltar ao menu");
						int numerofornecedor = entrada.nextInt();

						switch (numerofornecedor) {

							case 1:
								cadastrarFornecedor();
								break;
							case 2:
								deletarFornecedor();
								break;
							case 3:
								listarFornecedores();
								break;
							case 4:
								buscarFornecedorNome();
								break;
							case 0:
								i = 0;
								break;
							default:
								System.out.println("Opção invalida! Digite uma opção válida Entre 0 e 4");
								break;
						}
					}
					break;


				case 3:
					i = 1;
					while (i != 0) {

						System.out.println("Bem vindo à aba Produtos\n");
						System.out.println("Qual ação você deseja? Digite a opção desejada!");
						System.out.println("1.Cadastrar Produto");
						System.out.println("2.Remover Produtos");
						System.out.println("3.Listar Produtos");
						System.out.println("4.Procurar Produtos por nome");
						System.out.println("0.Voltar ao menu");
						int numeroProduto = entrada.nextInt();

						switch (numeroProduto) {

							case 1:
								cadastrarProduto();
								break;
							case 2:
								removerProduto();
								break;
							case 3:
								listarProdutos();
								break;
							case 4:
								buscarProdutoNome();
								break;
							case 0:
								i = 0;
								break;
							default:
								System.out.println("Opção invalida! Digite uma opção válida Entre 0 e 4");
								break;
						}
					}


				case 0:
					System.out.println("Programa encerrado.");
					break;

				default:
					System.out.println("Opção invalida! Digite uma opção válida Entre 0 e 3");
					break;
			}
		}
	}

}
