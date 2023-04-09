package org.example;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Triangulo extends Figura implements Dibujable{
    private Double base;
    private Double altura;



    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujamos un triangulo");
    }
}
