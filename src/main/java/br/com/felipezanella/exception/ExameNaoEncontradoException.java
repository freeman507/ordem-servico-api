package br.com.felipezanella.exception;

public class ExameNaoEncontradoException extends Throwable {

    public ExameNaoEncontradoException() {
        super("Exame não encontrado");
    }
}
