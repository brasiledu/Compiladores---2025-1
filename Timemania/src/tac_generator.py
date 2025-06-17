#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Gerador de Código de Três Endereços (TAC) para o Compilador Timemania
"""

from enum import Enum
from typing import List, Optional, Union
from dataclasses import dataclass


class TACOperandType(Enum):
    """Tipos de operandos TAC"""
    IDENTIFIER = "IDENTIFIER"      # Variável do programa (ex: x, y, z)
    TEMPORARY = "TEMPORARY"        # Variável temporária (ex: t0, t1, t2)
    CONSTANT = "CONSTANT"          # Constante (ex: 10, "hello", true)
    LABEL = "LABEL"               # Etiqueta (ex: L0, L1, L2)


@dataclass
class TACOperand:
    """
    Representa um operando em uma instrução TAC
    
    Attributes:
        type: Tipo do operando (IDENTIFIER, TEMPORARY, CONSTANT, LABEL)
        value: Valor do operando
        data_type: Tipo de dados (inteiro, texto, booleano) - opcional
    """
    
    type: TACOperandType
    value: str
    data_type: Optional[str] = None
    
    def __str__(self) -> str:
        return self.value
    
    def __repr__(self) -> str:
        return f"TACOperand({self.type.value}, '{self.value}')"


class TACOpcode(Enum):
    """Códigos de operação TAC"""
    
    # Operações aritméticas
    ADD = "ADD"           # t0 = a + b
    SUB = "SUB"           # t0 = a - b  
    MUL = "MUL"           # t0 = a * b
    DIV = "DIV"           # t0 = a / b
    MOD = "MOD"           # t0 = a % b
    
    # Operações lógicas
    AND = "AND"           # t0 = a AND b
    OR = "OR"             # t0 = a OR b
    NOT = "NOT"           # t0 = NOT a
    
    # Operações de comparação
    EQ = "EQ"             # t0 = a == b
    NE = "NE"             # t0 = a != b
    LT = "LT"             # t0 = a < b
    LE = "LE"             # t0 = a <= b
    GT = "GT"             # t0 = a > b
    GE = "GE"             # t0 = a >= b
    
    # Operações de atribuição
    ASSIGN = "ASSIGN"     # a = b
    COPY = "COPY"         # t0 = a
    
    # Operações de controle de fluxo
    GOTO = "GOTO"         # goto L0
    IF_GOTO = "IF_GOTO"   # if a goto L0
    IF_FALSE_GOTO = "IF_FALSE_GOTO"  # if !a goto L0
    LABEL = "LABEL"       # L0:
    
    # Operações de I/O
    READ = "READ"         # read a
    WRITE = "WRITE"       # write a
    WRITE_NL = "WRITE_NL" # write a (com quebra de linha)
    
    # Operações de função
    CALL = "CALL"         # call func, n_args
    RETURN = "RETURN"     # return a
    PARAM = "PARAM"       # param a
    
    # Operações de array
    ARRAY_ACCESS = "ARRAY_ACCESS"  # t0 = a[i]
    ARRAY_ASSIGN = "ARRAY_ASSIGN"  # a[i] = b
    
    # Operações de string
    CONCAT = "CONCAT"     # t0 = a + b (concatenação)
    
    # Comentários/informações
    COMMENT = "COMMENT"   # # comentário


@dataclass
class TACInstruction:
    """
    Representa uma instrução TAC
    
    Attributes:
        opcode: Código da operação
        result: Operando de destino (opcional)
        arg1: Primeiro argumento (opcional)
        arg2: Segundo argumento (opcional)
        comment: Comentário sobre a instrução (opcional)
    """
    
    opcode: TACOpcode
    result: Optional[TACOperand] = None
    arg1: Optional[TACOperand] = None
    arg2: Optional[TACOperand] = None
    comment: Optional[str] = None
    
    def __str__(self) -> str:
        """Converte a instrução para string no formato TAC"""
        
        if self.opcode == TACOpcode.LABEL:
            return f"{self.result}:"
        
        if self.opcode == TACOpcode.COMMENT:
            return f"# {self.comment}"
        
        if self.opcode == TACOpcode.GOTO:
            return f"goto {self.arg1}"
        
        if self.opcode == TACOpcode.IF_GOTO:
            return f"if {self.arg1} goto {self.arg2}"
        
        if self.opcode == TACOpcode.IF_FALSE_GOTO:
            return f"if !{self.arg1} goto {self.arg2}"
        
        if self.opcode in [TACOpcode.READ, TACOpcode.WRITE, TACOpcode.WRITE_NL]:
            return f"{self.opcode.value.lower()} {self.arg1}"
        
        if self.opcode == TACOpcode.RETURN:
            if self.arg1:
                return f"return {self.arg1}"
            else:
                return "return"
        
        if self.opcode == TACOpcode.CALL:
            return f"call {self.arg1}, {self.arg2}"
        
        if self.opcode == TACOpcode.PARAM:
            return f"param {self.arg1}"
        
        if self.opcode == TACOpcode.ASSIGN:
            return f"{self.result} = {self.arg1}"
        
        if self.opcode == TACOpcode.COPY:
            return f"{self.result} = {self.arg1}"
        
        if self.opcode == TACOpcode.ARRAY_ACCESS:
            return f"{self.result} = {self.arg1}[{self.arg2}]"
        
        if self.opcode == TACOpcode.ARRAY_ASSIGN:
            return f"{self.result}[{self.arg1}] = {self.arg2}"
        
        # Operações binárias
        if self.arg2 is not None:
            operator_map = {
                TACOpcode.ADD: "+",
                TACOpcode.SUB: "-",
                TACOpcode.MUL: "*",
                TACOpcode.DIV: "/",
                TACOpcode.MOD: "%",
                TACOpcode.AND: "AND",
                TACOpcode.OR: "OR",
                TACOpcode.EQ: "==",
                TACOpcode.NE: "!=",
                TACOpcode.LT: "<",
                TACOpcode.LE: "<=",
                TACOpcode.GT: ">",
                TACOpcode.GE: ">=",
                TACOpcode.CONCAT: "+",
            }
            
            if self.opcode in operator_map:
                op = operator_map[self.opcode]
                return f"{self.result} = {self.arg1} {op} {self.arg2}"
        
        # Operações unárias
        if self.opcode == TACOpcode.NOT:
            return f"{self.result} = NOT {self.arg1}"
        
        # Fallback genérico
        parts = [self.opcode.value]
        if self.result:
            parts.append(str(self.result))
        if self.arg1:
            parts.append(str(self.arg1))
        if self.arg2:
            parts.append(str(self.arg2))
        
        return " ".join(parts)
    
    def __repr__(self) -> str:
        return f"TACInstruction({self.opcode.value}, {self.result}, {self.arg1}, {self.arg2})"


class TACGenerator:
    """
    Gerador de código de três endereços
    
    Attributes:
        instructions: Lista de instruções TAC geradas
        temp_counter: Contador para variáveis temporárias
        label_counter: Contador para etiquetas
    """
    
    def __init__(self):
        self.instructions: List[TACInstruction] = []
        self.temp_counter = 0
        self.label_counter = 0
    
    def new_temp(self, data_type: str = "inteiro") -> TACOperand:
        """Cria uma nova variável temporária"""
        temp_name = f"t{self.temp_counter}"
        self.temp_counter += 1
        return TACOperand(TACOperandType.TEMPORARY, temp_name, data_type)
    
    def new_label(self) -> TACOperand:
        """Cria uma nova etiqueta"""
        label_name = f"L{self.label_counter}"
        self.label_counter += 1
        return TACOperand(TACOperandType.LABEL, label_name)
    
    def emit(self, instruction: TACInstruction):
        """Adiciona uma instrução à lista"""
        self.instructions.append(instruction)
    
    def emit_comment(self, comment: str):
        """Adiciona um comentário"""
        self.emit(TACInstruction(TACOpcode.COMMENT, comment=comment))
    
    def emit_label(self, label: TACOperand):
        """Adiciona uma etiqueta"""
        self.emit(TACInstruction(TACOpcode.LABEL, result=label))
    
    def emit_assign(self, target: TACOperand, source: TACOperand):
        """Adiciona uma atribuição"""
        self.emit(TACInstruction(TACOpcode.ASSIGN, result=target, arg1=source))
    
    def emit_binary_op(self, opcode: TACOpcode, result: TACOperand, 
                       left: TACOperand, right: TACOperand):
        """Adiciona uma operação binária"""
        self.emit(TACInstruction(opcode, result=result, arg1=left, arg2=right))
    
    def emit_unary_op(self, opcode: TACOpcode, result: TACOperand, operand: TACOperand):
        """Adiciona uma operação unária"""
        self.emit(TACInstruction(opcode, result=result, arg1=operand))
    
    def emit_goto(self, label: TACOperand):
        """Adiciona um salto incondicional"""
        self.emit(TACInstruction(TACOpcode.GOTO, arg1=label))
    
    def emit_if_goto(self, condition: TACOperand, label: TACOperand):
        """Adiciona um salto condicional"""
        self.emit(TACInstruction(TACOpcode.IF_GOTO, arg1=condition, arg2=label))
    
    def emit_if_false_goto(self, condition: TACOperand, label: TACOperand):
        """Adiciona um salto condicional falso"""
        self.emit(TACInstruction(TACOpcode.IF_FALSE_GOTO, arg1=condition, arg2=label))
    
    def emit_read(self, variable: TACOperand):
        """Adiciona uma operação de leitura"""
        self.emit(TACInstruction(TACOpcode.READ, arg1=variable))
    
    def emit_write(self, value: TACOperand, newline: bool = True):
        """Adiciona uma operação de escrita"""
        opcode = TACOpcode.WRITE_NL if newline else TACOpcode.WRITE
        self.emit(TACInstruction(opcode, arg1=value))
    
    def generate_code(self) -> str:
        """Gera o código TAC como string"""
        lines = []
        for instruction in self.instructions:
            lines.append(str(instruction))
        return "\n".join(lines)
    
    def save_to_file(self, filename: str):
        """Salva o código TAC em um arquivo"""
        with open(filename, 'w', encoding='utf-8') as f:
            f.write(self.generate_code())
    
    def clear(self):
        """Limpa as instruções geradas"""
        self.instructions.clear()
        self.temp_counter = 0
        self.label_counter = 0


# Funções utilitárias para criar operandos
def make_identifier(name: str, data_type: str = "inteiro") -> TACOperand:
    """Cria um operando identificador"""
    return TACOperand(TACOperandType.IDENTIFIER, name, data_type)


def make_constant(value: Union[str, int, bool], data_type: str = None) -> TACOperand:
    """Cria um operando constante"""
    if data_type is None:
        if isinstance(value, int):
            data_type = "inteiro"
        elif isinstance(value, str):
            data_type = "texto"
        elif isinstance(value, bool):
            data_type = "booleano"
    
    return TACOperand(TACOperandType.CONSTANT, str(value), data_type)


def make_label(name: str) -> TACOperand:
    """Cria um operando etiqueta"""
    return TACOperand(TACOperandType.LABEL, name)
