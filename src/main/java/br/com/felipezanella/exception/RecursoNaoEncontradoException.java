package br.com.felipezanella.exception;

public class RecursoNaoEncontradoException extends Throwable {

    public RecursoNaoEncontradoException() {
        super("Exame não encontrado");
    }
}
