from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor
from Interpreter import Interpreter
from ParityDistorter import ParityDistorter


def interpreter_file(file_name="test.txt"):
    input_stream = FileStream(file_name)
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    tree = parser.prog()

    interpreter = Interpreter()
    interpreter.visit(tree)

    print("Memoria:", interpreter.memory)


def interpreter_string(code):
    input_stream = InputStream(code)
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    tree = parser.prog()

    interpreter = Interpreter()
    interpreter.visit(tree)

    print("\nMemoria:", interpreter.memory)


def main_distorter(code):
    input_stream = InputStream(code)
    lexer = langLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = langParser(token_stream)
    tree = parser.prog()

    distorter = ParityDistorter()
    return distorter.visit(tree)


if __name__ == "__main__":
    with open("test.txt", "r") as file:
        code = file.read()
        print("Original code\n", code)

        distorted_code = main_distorter(code)
        print("\nObfuscated code\n", distorted_code)

        interpreter_string(distorted_code)
