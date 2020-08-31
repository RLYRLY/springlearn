package org.springlearn.springlearn.service;

import org.springlearn.springlearn.entity.Account;

import java.util.List;

public interface IAccountService {

    int add(Account account);
    int delete(int id);
    int update(Account account);
    Account findAccountByID(int id);
    List<Account> findAccountListsByID();




}
