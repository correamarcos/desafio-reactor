package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        return Mono.defer(() -> user.password() == null || user.password().length() < 9
                   ? Mono.error(new IllegalArgumentException("Usuario invalido"))
                   : Mono.empty()
        );
    }
}
