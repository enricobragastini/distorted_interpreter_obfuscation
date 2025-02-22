from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor
from Interpreter import Interpreter
from Distorter import Distorter


def main_interpreter():
    input_stream = FileStream("test.txt")
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    tree = parser.prog()

    interpreter = Interpreter()
    interpreter.visit(tree)

    print("Memoria:", interpreter.memory)


def main_distorter():
    input_stream = FileStream("test.txt")
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    tree = parser.prog()

    distorter = Distorter()
    print(distorter.visit(tree))


if __name__ == "__main__":
    main_distorter()
