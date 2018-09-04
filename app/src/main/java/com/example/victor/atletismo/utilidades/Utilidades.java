package com.example.victor.atletismo.utilidades;

public class Utilidades {

    public static final String TABLA_ATLETAS = "atletas";
    public static final String ATLETAS_ID = "id";
    public static final String ATLETAS_NOMBRE = "nombre";
    public static final String ATLETAS_CATEGORIA = "categoria";
    public static final String ATLETAS_PRUEBA = "prueba";
    public static final String CREAR_TABLA_ATLETAS = "CREATE TABLE " + TABLA_ATLETAS + "( "
            + ATLETAS_ID + " VARCHAR, " + ATLETAS_NOMBRE + " VARCHAR, " + ATLETAS_CATEGORIA + " VARCHAR, " + ATLETAS_PRUEBA + " VARCHAR )";
}
