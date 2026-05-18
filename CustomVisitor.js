import Tema39568Visitor from "./generated/Tema39568Visitor.js";

export class CustomVisitor extends Tema39568Visitor {

    visitPrograma(ctx) {
        return this.visitChildren(ctx);
    }

    visitInstrucciones(ctx) {
        return this.visitChildren(ctx);
    }

    visitInstruccion(ctx) {
        return this.visitChildren(ctx);
    }

    visitDecision(ctx) {
        const cond = ctx.condicion().getText();
        const sentencias = ctx.sentencia();
        if (cond === '1') {
            this.visit(sentencias[0]);
        } else if (cond === '0') {
            if (sentencias.length > 1) {
                this.visit(sentencias[1]);
            }
        }
    }

    visitSalidaExpr(ctx) {
        this.visit(ctx.salida());
        const next = ctx.sentencia();
        if (next) {
            this.visit(next);
        }
    }

    visitSalida(ctx) {
        const texto = ctx.CADENA().getText();
        console.log(texto.slice(1, -1));
    }

    visitTerminarExpr(ctx) {
        console.log("[return]");
    }
}
