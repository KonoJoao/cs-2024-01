"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var expressao1 = /^(.){5,30}$/;
var expressao2 = /^(?=.*[A-Z])(?=.*\d)(?=.*[^A-Za-z0-9]).{8,12}$/;
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
rl.question("Teste expressão 1: ", function (resposta) {
    console.log("".concat(expressao1.test(resposta)));
    console.log(resposta.length);
    rl.question("Teste expressão 2: ", function (resposta) {
        console.log("".concat(expressao2.test(resposta)));
        console.log(resposta.length);
        rl.close();
    });
});
