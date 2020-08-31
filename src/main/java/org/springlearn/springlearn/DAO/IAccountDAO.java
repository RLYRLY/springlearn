package org.springlearn.springlearn.DAO;

import org.springlearn.springlearn.entity.Account;

import java.util.List;

public interface IAccountDAO {

    int add(Account account);
    int delete(int id);
    int update(Account account);
    Account findAccountByID(int id);
    List<Account> findAccountListsByID();



}
