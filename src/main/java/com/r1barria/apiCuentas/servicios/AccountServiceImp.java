package com.r1barria.apiCuentas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r1barria.apiCuentas.modelos.Account;
import com.r1barria.apiCuentas.repositorios.AccountRepository;

@Service
public class AccountServiceImp implements InterfaceAccountService{

    @Autowired
    AccountRepository accountRepository;


    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account guardar(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account obtenerPorId(long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        accountRepository.deleteById(id);
    }
    
}
