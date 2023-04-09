package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor //todos los constructores
@NoArgsConstructor //Constructor vacio
@ToString
@EqualsAndHashCode

public abstract class Figura {
    private Integer numeroDeLados;
    public abstract Double calcularArea();
}
