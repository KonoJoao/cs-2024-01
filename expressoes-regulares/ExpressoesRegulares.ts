import * as readline from "readline";

const expressao1: RegExp = /^(.){5,30}$/;
const expressao2: RegExp = /^(?=.*[A-Z])(?=.*\d)(?=.*[^A-Za-z0-9]).{8,12}$/;
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Teste expressão 1: ", (resposta) => {
  console.log(`${expressao1.test(resposta)}`);
  console.log(resposta.length);

  rl.question("Teste expressão 2: ", (resposta) => {
    console.log(`${expressao2.test(resposta)}`);
    console.log(resposta.length);

    rl.close();
  });
});
