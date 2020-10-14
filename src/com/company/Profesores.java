package com.company;

import java.util.ArrayList;
import java.util.List;

public class Profesores extends Persona{
    List<Alumnos>haTreballat;

    public Profesores(){
        this.haTreballat = new ArrayList<Alumnos>();
    }
}
