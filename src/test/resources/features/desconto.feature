# language: pt

  Funcionalidade: Receber cupom de desconto
    Eu como usuário
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    Cenário: Visualizar código de desconto
      Dado que estou no site da QAzando
      Quando preencho o email com "ganzenmuller1997@gmail.com"
      E clico em ganhar cupom
      Então devo visualizar o codigo de desconto