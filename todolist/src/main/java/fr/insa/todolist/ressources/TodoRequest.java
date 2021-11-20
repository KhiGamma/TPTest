package fr.insa.todolist.ressources;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoRequest {
    private String nom;
    private String etatAvancement;
}
