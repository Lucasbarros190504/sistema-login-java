package com.lucas.sistemalogin;


import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int menu;
    String nomeCadastro = "";
    String senha = "";
      do {
          System.out.println("Bem vindo ao Sistema Login");
          System.out.println("---------MENU----------");
          System.out.println("[1] Cadastrar Usuario");
          System.out.println("[2] Login ");
          System.out.println("[0] Sair");
          menu = input.nextInt();
          input.nextLine();

          int contador = 0;

          if (menu == 1) {
              boolean cadastro = true;
              System.out.println("-----Vamos fazer o seu cadastro!-----" );
              System.out.print("Digite o seu nome: ");
              nomeCadastro = input.nextLine();
              System.out.println("OK, agora vamos cadastrar sua senha de acesso!");


              while (cadastro) {
                  System.out.print("Digite sua senha: ");
                  senha = input.nextLine();

                  System.out.print("Digite novamente a sua senha: ");
                  String confirmacaoSenha = input.nextLine();

                  if (senha.equals(confirmacaoSenha)) {
                      System.out.println();
                      System.out.println("Cadastro concluido com sucesso!");
                      System.out.println("Aperte ENTER para continuar!");
                      input.nextLine();
                      cadastro = false;

                  } else {
                      System.out.println("As senhas não conferem. Tente novamente.!");


                  }
              }

          } else if (menu == 2) {
              boolean login = true;

              if (nomeCadastro.isEmpty() || senha.isEmpty()) {

                  System.out.println("NENHUM USÚARIO CADASTRADO!");
                  System.out.println("APERTE ENTER PARA VOLTAR AO MENU");
                  input.nextLine();

              } else {
                  while ((login) && (contador < 3)) {
                      System.out.print("Usuario: ");
                      String usuarioLogin = input.nextLine();

                      System.out.print("Digite a sua senha: ");
                      String senhaLogin = input.nextLine();

                      if (usuarioLogin.equals(nomeCadastro) && (senhaLogin.equals(senha))) {
                          System.out.println("Login efetuado com sucesso!");
                          System.out.println("Parabéns!!  Aperte ENTER para continuar!");
                          input.nextLine();
                          login = false;

                      } else {
                          ++contador;
                          System.out.println("Senha ou usuario incorretos!");
                          System.out.println("Tentativas restantes: " + (3 - contador));
                      }

                      if (contador == 3) {
                          System.out.println("Você excedeu o limite de tentativas!");
                          System.out.println("Aperte ENTER para continuar o programa!");
                          input.nextLine();

                      }
                  }
              }

          } else if (menu == 0) {
              System.out.print("Programa encerrado!");
              return;
          }

      }  while (menu != 0);

    }
}
