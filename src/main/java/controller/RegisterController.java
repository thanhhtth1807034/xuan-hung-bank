package controller;

import entity.Account;
import model.AccountModel;

//import entity.RegisterAccount;
//import model.RegisterAccountModel;

public class RegisterController {
    private AccountModel registerAccountModel = new AccountModel();

    public void create(Account registerAccount) {
        registerAccountModel.saveUser(registerAccount);
    }
}
