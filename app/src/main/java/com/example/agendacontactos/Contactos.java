package com.example.agendacontactos;

import java.io.Serializable;
import java.util.List;

public class Contactos implements Serializable {
    private String Usuario;
    private String Email;
    private String Twitter;
    private String Tel;
    private String FeNa;
    public static List<Contactos> Listcontactos;

    public Contactos(String usuario, String email, String twitter, String tel, String feNa) {
        Usuario = usuario;
        Email = email;
        Twitter = twitter;
        Tel = tel;
        FeNa = feNa;
    }

    public void agregar(Contactos c){
        getListcontactos().add(c);
    }
    public List<Contactos> getListcontactos() {
        return Listcontactos;
    }

    public void setListcontactos(List<Contactos> listcontactos) {
        Listcontactos = listcontactos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getFeNa() {
        return FeNa;
    }

    public void setFeNa(String feNa) {
        FeNa = feNa;
    }
}
