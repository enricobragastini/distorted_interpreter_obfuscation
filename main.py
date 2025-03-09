import argparse
from antlr4 import *
from lang.langLexer import langLexer
from lang.langParser import langParser
from Interpreter import Interpreter
from ParityDistorter import ParityDistorter
from FlatteningDistorter import FlatteningDistorter


def tree(code):
    input_stream = InputStream(code)
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    return parser.prog()


def interpreter_string(code):
    interpreter = Interpreter()
    interpreter.visit(tree(code))

    print("\nMemoria:", interpreter.memory)


def cff_distorter(code):
    distorter = FlatteningDistorter()
    return distorter.visit(tree(code))


def parity_distorter(code):
    distorter = ParityDistorter()
    return distorter.visit(tree(code))


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Script per offuscamento e/o interpretazione del codice.")

    parser.add_argument("input_file", type=str, help="File di input contenente il codice sorgente.")
    parser.add_argument("-o", "--output_file", type=str, help="File di output per il codice offuscato.")

    parser.add_argument("-m", "--mode", type=str, choices=["obf", "int", "both"],
                        required=True, help="Modalità: offusca, interpreta, o entrambe.")

    parser.add_argument("-t", "--type", type=str, choices=["par", "cff"],
                        help="Tipo di offuscazione (necessario se si seleziona una modalità con offuscamento).")

    args = parser.parse_args()

    with open(args.input_file, "r") as file:
        code = file.read()

    if args.mode in ["obf", "both"]:
        if not args.type:
            parser.error("Il tipo di offuscamento è obbligatorio.")

        if args.type == "par":
            code = parity_distorter(code)
        elif args.type == "cff":
            code = cff_distorter(code)

        if args.output_file:
            with open(args.output_file, "w") as file:
                file.write(code)
            print(f"Codice offuscato scritto nel file {args.output_file}")
        else:
            print("\nCodice offuscato: \n", code)

    if args.mode in ["int", "both"]:
        interpreter_string(code)
