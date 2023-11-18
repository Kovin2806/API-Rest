package com.r1barria.apiCuentas.servicios;

import java.util.List;

import com.r1barria.apiCuentas.modelos.Account;

public interface InterfaceAccountService {
    
    public List<Account> listAccounts();

    public Account guardar(Account account);

    public Account obtenerPorId(long id);

    public void eliminar(long id);

}
