package org.springlearn.springlearn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springlearn.springlearn.entity.Account;
import org.springlearn.springlearn.service.IAccountService;

import java.util.List;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;

    //add
    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String addAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }

    //delete
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public int deleteAccount(@PathVariable("id") int id){
        return accountService.delete(id);
    }


    //update
    @RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
    public String  update(@PathVariable("id") int id,
                          @RequestParam(value = "name") String name,
                          @RequestParam(value = "money") double money){
     Account account=new Account();
     account.setMoney(money);
     account.setName(name);
     account.setId(id);
     int t=accountService.update(account);
     if(t==1){
         return account.toString();
     }else{
        return "fail";
     }
    }

    //find
    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public  Account findAccountByID(@PathVariable("id") int id){
        return accountService.findAccountByID(id);
    }

    //findlist
    @RequestMapping(value = "/list",method =RequestMethod.GET )
    public List<Account> findAccountListsByID(){
        return accountService.findAccountListsByID();
    }









}
