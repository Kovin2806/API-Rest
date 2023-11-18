package com.r1barria.apiCuentas.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r1barria.apiCuentas.modelos.Account;
import com.r1barria.apiCuentas.servicios.AccountServiceImp;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
    
    @Autowired
    AccountServiceImp accountServiceImp;

    //////////////////////////////
    //LISTADO DE CUENTAS (GET)
    @GetMapping("/accounts")
    public List<Account> listAccounts(){
        return accountServiceImp.listAccounts();
    }

    //////////////////////////////
    //DETALLE DE CUENTA (GET)
    @GetMapping("/accounts/{id}")
    public ResponseEntity<Account> obtenerPorId(@PathVariable long id){
        Account accountPorId = accountServiceImp.obtenerPorId(id);
        return ResponseEntity.ok(accountPorId);
    }

    /////////////////////////////
    //CUENTA NUEVA (POST)
    @PostMapping("/accounts")
    public ResponseEntity<Account> guardar(@RequestBody Account account) {
        Account newAccount = accountServiceImp.guardar(account);
        return new ResponseEntity<>(newAccount,HttpStatus.CREATED);
    }

    
    //MODIFICAR SALDO (PUT)
    @PutMapping("/accounts/{id}")
    public ResponseEntity<Account> actualizarBalance(@PathVariable long id,@RequestBody Account account){
        Account accountPorId = accountServiceImp.obtenerPorId(id);
        accountPorId.setBalance(account.getBalance());
        Account accountUpdate = accountServiceImp.guardar(accountPorId);
        return new ResponseEntity<>(accountUpdate,HttpStatus.CREATED);
    } 
    
    //ELIMINAR CUENTA (DELETE)
    @DeleteMapping("/accounts/{id}")
    public void eliminarCuenta(@PathVariable Long id) {
        Account accountPorId = accountServiceImp.obtenerPorId(id);

            // Desactivar la cuenta en lugar de eliminar físicamente
            accountPorId.setActivo(false);
            accountServiceImp.guardar(accountPorId);
    }

}
