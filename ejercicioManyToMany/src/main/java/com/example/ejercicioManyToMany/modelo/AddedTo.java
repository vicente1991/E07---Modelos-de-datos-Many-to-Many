package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class AddedTo{

    @Builder.Default
    @EmbeddedId
    private AddedToPK id= new AddedToPK();

    private LocalDateTime dateTime;

    private int order;
}
