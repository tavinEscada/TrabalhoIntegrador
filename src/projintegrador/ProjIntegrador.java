package projintegrador;

import basedados.FakeBanco;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import modelo.Cliente;
import modelo.Produto;
import modelo.Compra;

public class ProjIntegrador {

    //imaginando que o cliente chegou com um carrinho com prod. no caixa
    private static void realizaCompra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Iniciando uma nova venda.");
        
        Date agora = new Date();
            
        SimpleDateFormat dd = new SimpleDateFormat();
            
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            
        Calendar calendario = Calendar.getInstance(); 
        calendario.add(Calendar.DAY_OF_MONTH, 14);
        Date diaEntrega = calendario.getTime();
        
        //criando uma venda sem cliente cadastrado (null)
        
        Compra novaVenda = new Compra(null, formatoData.format(diaEntrega));
        

        String codigoProd;
        do {
            System.out.println("Informe o código do produto: ");
            codigoProd = entrada.nextLine();

            //encerrando o laço caso sair tenha sido digitado
            if (codigoProd.equalsIgnoreCase("sair")) {
                break;
            }

            //vamos cons. o produto no BD
            Produto prodSelecionado = FakeBanco.retornaProdutoCodigo(codigoProd);

            //verificando se de FATO o produto está no banco
            if (prodSelecionado != null) {
                System.out.println("Produto: " + prodSelecionado.getNome());

                novaVenda.addProdutoCarrinho(prodSelecionado);
                System.out.println("Preço da compra: R$"
                        + novaVenda.getPrecoTotal() + "\n");

            } else {
                System.out.println("Código não cadastrado ou "
                        + "incorreto, informe novamente");
            }
        } while (!codigoProd.equalsIgnoreCase("sair"));

        System.out.println("Compra realizada com sucesso:\n" + novaVenda);
        FakeBanco.insertCompra(novaVenda);

    }

    private static void mostraEstoque() {

        System.out.println("\nEstoque atual:");

        Vector<Produto> produtosBD = FakeBanco.selectAllProdutos();

        for (Produto i : produtosBD) {
            System.out.println(i);
        }

        System.out.println("");
    }

    private static void cadastraProd() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("----- Cadastro de novo produto -----");
        System.out.println("Informe o preço do produto:");
        double precoProduto = entrada.nextDouble();
        entrada.skip("\n");
 
        System.out.println("Informe o nome do produto: ");
        String nomeProduto = entrada.nextLine();
        
        String sexoProduto = "";
        do{
            System.out.println("Informe o sexo ('F' ou 'M') do produto (se for unissex, digite 'U'):");
            sexoProduto = entrada.nextLine();
            
            if(sexoProduto.equals("") || !sexoProduto.equals("F") && !sexoProduto.equals("M") && !sexoProduto.equals("U")){
                System.out.println("Entrada inválida.");
            }
            
        }while(sexoProduto.equals("") || !sexoProduto.equals("F") && !sexoProduto.equals("M") && !sexoProduto.equals("U"));
        
        System.out.println("Informe a modalidade: ");
        String modProduto = entrada.nextLine();

        //verificando se existe um produto com este cod no banco
        Produto prodBD;
        String codigo;
        do {
            //codigo ja esta atrelado a outro produto
            System.out.println("Informe o código do produto: ");
            codigo = entrada.nextLine();
            prodBD = FakeBanco.retornaProdutoCodigo(codigo);
            if (prodBD != null) {
                System.err.println("Código já cadastrado em outro produto");
            }
        } while (prodBD != null);

        Produto novoProduto = new Produto(precoProduto, codigo, nomeProduto, modProduto, sexoProduto);

        FakeBanco.insertProduto(novoProduto);
        System.out.println("Produto cadastrado.");

    }

    private static void atualizaEstoque() {
        Scanner entrada = new Scanner(System.in);

        //produto que supostamente esta no banco
        Produto prodBD = null;

        //garantindo que um código válido será informado
        do {
            System.out.println("Informe o cód do produto a ser atualizado:");
            String codProduto = entrada.nextLine();

            prodBD = FakeBanco.retornaProdutoCodigo(codProduto);
            
            //produto não existe no banco
            if(prodBD == null){
                System.out.println("Código inválido.");
            }
        } while (prodBD == null);
        
        System.out.println("Produto a ser atualizado: " + prodBD.getNome());
        
        System.out.println("Deseja atualizar:\n 1 - preço;\n 2 - Modalidade;\n 3 - Sexo");
        int opcao = entrada.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Informe o novo preço:");
                double preco = entrada.nextDouble();
                
                //o novo valor não poder ser menor que 50% do valor atual
                if(preco < prodBD.getPreco()*0.5){
                    System.out.println("O preço não pode ser menor que 50% do valor atual.");
                    return;
                }

                FakeBanco.updatePrecoProduto(prodBD, preco);
                
                break;
                
            case 2:
                System.out.println("Informe a nova modalidade:");
                
                String novaMod = entrada.nextLine();
                FakeBanco.updateModalidadeProduto(prodBD, novaMod);
                System.out.println("Modalidade atualizada.");
                
                break;
                
            case 3:
                
                System.out.println("Informe o sexo: ('M', 'F' ou 'U' - unissex");
                
                String sexo = entrada.nextLine();
                entrada.skip("\n");
                
                if(sexo.equals("") || !sexo.equals("F") && !sexo.equals("M") && !sexo.equals("U")){
                    System.out.println("Entrada inválida.");
                }else{
                    prodBD.setSexo(sexo);
                    System.out.println("Sexo atualizado.");
                }
                
                break;
                
            default:
                System.out.println("Opção inválida.");
        }

    }
    
    private static void cadastraCliente(){
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Cadastrando um novo cliente.\nInforme o nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe o CPF:");
        String cpf = entrada.nextLine();
        
        System.out.println("Informe a cidade:");
        String cidade = entrada.nextLine();
        
        System.out.println("Informe o estado:");
        String estado = entrada.nextLine();
        
        System.out.println("Informe o bairro:");
        String bairro = entrada.nextLine();
        
        System.out.println("Informe o cep:");
        String cep = entrada.nextLine();
        
        System.out.println("Informe o número da residência:");
        int num = entrada.nextInt();
        
        entrada.skip("\n");
        
        System.out.println("Informe o email:");
        String email = entrada.nextLine();
        
        System.out.println("Informe a senha:");
        String senha = entrada.nextLine();

        Cliente novoCliente = new Cliente(nome, cpf, cidade, estado, bairro, cep, num, email, senha);

        FakeBanco.insertCliente(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!!!");
    }

    public static void main(String[] args) {

        FakeBanco.iniciaBancoDados();

        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nDigite:\n 1 - Realizar venda; \n 2 - Listar estoque;"
                    + "\n 3 - Cadastrar produto;\n 4 - Atualizar produto;" + "\n 5 - Cadastrar novo cliente;"+"\n 6 - Finalizar o sistema");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    realizaCompra();
                    break;
                    
                case 2:
                    mostraEstoque();
                    break;
                    
                case 3:
                    cadastraProd();
                    break;
                    
                case 4:
                    atualizaEstoque();
                    break;
                    
                case 5:
                    cadastraCliente();
                    break;
                    
                case 6:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 6);

    }

}