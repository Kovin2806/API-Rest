package com.r1barria.apiCuentas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.r1barria.apiCuentas.modelos.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    
}
