package com.r1barria.apiCuentas.modelos;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Account implements Serializable{
    
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 

    private String nombreC;
    private String numeroC;
    private double balance;
    private boolean activo;


    public Account(){

    }

    /////////////////////////
    public String getnombreC() {
		return nombreC;
	}

	public void setnombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getnumeroC() {
		return numeroC;
	}

	public void setApellido(String numeroC) {
		this.numeroC = numeroC;
	}
    ///////////////////////////


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }



    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

}
