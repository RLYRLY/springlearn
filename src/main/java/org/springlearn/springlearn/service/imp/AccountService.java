package org.springlearn.springlearn.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springlearn.springlearn.DAO.IAccountDAO;
import org.springlearn.springlearn.entity.Account;
import org.springlearn.springlearn.service.IAccountService;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDAO iAccountDAO;
    @Override
    public int add(Account account) {
        return  iAccountDAO.add(account);
    }

    @Override
    public int delete(int id) {
        return iAccountDAO.delete(id);
    }

    @Override
    public int update(Account account) {
        return iAccountDAO.update(account);
    }

    @Override
    public Account findAccountByID(int id) {
        return iAccountDAO.findAccountByID(id);
    }

    @Override
    public List<Account> findAccountListsByID() {
        return iAccountDAO.findAccountListsByID();
    }
}
