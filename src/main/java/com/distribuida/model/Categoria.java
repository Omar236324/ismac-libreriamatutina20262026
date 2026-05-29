//package com.distribuida.model;
//
//import jakarta.persistence.*;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "categoria")
//public class Categoria {
//
//    //METODOS GETTERS AND SETTERS
//    @Getter
//    @Setter
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_categoria")
//    private  int idCategoria;
//    @Column(name = "categoria")
//    private String categoria;
//    @Column(name = "descripcion")
//    private  String descripcion;
////CONSTRUCTOR VACIO
//    public Categoria() {}
//
//    //CONSTRUCTOR DE PARAMETROS
//
//    public Categoria(int idCategoria, String categoria, String descripcion ){
//        this.idCategoria = idCategoria;
//        this.categoria = categoria;
//        this.descripcion = descripcion;
//
//    }
////METODOS GETTER AND SETTERS
//
//    public void setIdCategoria(String Idcategoria) {this.idCategoria = idCategoria;}
//
//    public String getCategoria() {return categoria; }
//
//    public void setCategoria(String categoria) {this.categoria = categoria; }
//
//    public String getDescripcion() {return descripcion; }
//
//    public void setIdCategoria(int idCategoria) {this.idCategoria = idCategoria; }
//
//    @Override
//    public String toString() {
//        return "Categoria{" +
//                "idCategoria=" + idCategoria +
//                ", categoria='" + categoria + '\'' +
//                ", descripcion='" + descripcion + '\'' +
//                '}';
//    }
//}
