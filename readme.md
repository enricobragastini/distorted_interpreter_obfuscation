# Parity and CFG Flattening Obfuscations

## 📄 **Project Overview**
This project implements two code obfuscation techniques, inspired by the paper *Property-driven Code Obfuscations*. The implemented techniques are:

- **Parity Distorter**: Obfuscates the parity abstraction on numerical values.
- **Flattening Distorter**: Obfuscates the Control Flow Graph (CFG) by introducing a dynamic program counter.

Both techniques are implemented using **Python** and **ANTLR4**.

## 📚 Slides

The slides for this project can be found [here](https://github.com/enricobragastini/distorted_interpreter_obfuscation/blob/main/docs/presentation.pdf).

---

## 🚀 **Setup Instructions**

### 1. **Clone the Repository**
```bash
git clone https://github.com/enricobragastini/distorted_interpreter_obfuscation.git

cd distorted_interpreter_obfuscation
```

### 2. **Install Dependencies**
```bash
pip install -r requirements.txt
```

### 3. **Run the script**
```bash
python main.py <input_file> -m <mode> [-t <type>] [-o <output_file>]
```

where:

- `<input_file>`: Path to the input file.
- `<mode>`: Obfuscation mode. Choose between `par` and `cff`.
- `<type>`: Obfuscation type. Choose between:
    - `int`: Just run the interpreter, without obfuscating the code.
    - `obf`: Obfuscate the code. Requires the `-o` flag.
    - `both`: Run the interpreter and obfuscate the code.
- `<output_file>`: Path to the output file for the obfuscated code. Required if `<type>` is `obf`. If not provided and `<type>` is `obf`, the obfuscated code will be printed to the console.

---

# 📝 References
- [Property-driven Code Obfuscations](https://link.springer.com/chapter/10.1007/978-3-031-22308-2_12)