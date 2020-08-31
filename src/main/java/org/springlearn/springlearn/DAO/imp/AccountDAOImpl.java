package org.springlearn.springlearn.DAO.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springlearn.springlearn.DAO.IAccountDAO;
import org.springlearn.springlearn.entity.Account;

import java.util.List;

@Repository
public class AccountDAOImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert  into account(name, money) values(?,?)",
                account.getName(),account.getMoney());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from account where id=?",id);
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update account set name=?, money=? where id=?",
                account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public Account findAccountByID(int id) {
       List<Account> accounts= jdbcTemplate.query("select * from account where id=?",new Object[]{id},
               new BeanPropertyRowMapper(Account.class));
       if(accounts!=null&&accounts.size()>0){
           return accounts.get(0);
       }else{
           return null;
       }
    }

    @Override
    public List<Account> findAccountListsByID() {
       List<Account> accounts=jdbcTemplate.query("select * from account",new BeanPropertyRowMapper(Account.class));
       if(accounts!=null){
           return accounts;
       }else{
           return null;
       }
    }
}
