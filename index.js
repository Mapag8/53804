import antlr4, { CharStreams, CommonTokenStream, ErrorListener } from "antlr4";
import Tema39568Lexer from "./generated/Tema39568Lexer.js";
import Tema39568Parser from "./generated/Tema39568Parser.js";
import { CustomVisitor } from "./CustomVisitor.js";
import fs from "fs";

class CustomErrorListener extends ErrorListener {
    syntaxError(recognizer, offendingSymbol, line, column, msg, err) {
        console.error(`Línea ${line}, col ${column}: ${msg}`);
        process.exit(1);
    }
}

const errorListener = new CustomErrorListener();

const inputFile = process.argv[2] ?? "valido1.txt";
let input;
try {
    input = fs.readFileSync(inputFile, "utf8");
} catch (err) {
    console.error(`No se pudo leer ${inputFile}:`, err.message);
    process.exit(1);
}

const inputStream = CharStreams.fromString(input);
const lexer = new Tema39568Lexer(inputStream);
lexer.removeErrorListeners();
lexer.addErrorListener(errorListener);

const tokenStream = new CommonTokenStream(lexer);
tokenStream.fill();

console.log("Lexema".padEnd(30) + "| Token");
console.log("-".repeat(45));
for (const token of tokenStream.tokens) {
    if (token.type === antlr4.Token.EOF) continue;
    const name = Tema39568Lexer.symbolicNames[token.type] ?? `<${token.type}>`;
    console.log(token.text.padEnd(30) + "| " + name);
}
console.log();

tokenStream.seek(0);
const parser = new Tema39568Parser(tokenStream);
parser.removeErrorListeners();
parser.addErrorListener(errorListener);

const tree = parser.programa();

console.log("\nEntrada válida.");
const instrucciones = tree.instrucciones().instruccion();
instrucciones.forEach((instr, i) => {
    console.log(`\nÁrbol enunciado ${i + 1}:`, instr.toStringTree(parser.ruleNames));
});
console.log();

const visitor = new CustomVisitor();
visitor.visit(tree);
