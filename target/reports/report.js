$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Receber cupom de desconto",
  "description": "Eu como usuário\r\nquero receber um cupom de desconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-cupom-de-desconto",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar código de desconto",
  "description": "",
  "id": "receber-cupom-de-desconto;visualizar-código-de-desconto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da QAzando",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "preencho o email com \"ganzenmuller1997@gmail.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "devo visualizar o codigo de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 10137488100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ganzenmuller1997@gmail.com",
      "offset": 22
    }
  ],
  "location": "DescontosStep.preencho_o_email_com(String)"
});
formatter.result({
  "duration": 492938300,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 2309574200,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.devo_visualizar_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 59882800,
  "status": "passed"
});
});