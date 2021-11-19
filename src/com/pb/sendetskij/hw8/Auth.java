package com.pb.sendetskij.hw8;

public class Auth {
    private  String login;
    private  String password;
    private  String confirmPassword;
    static String loginFormat = "[\\dA-Za-z]{5,20}";
    static String passwordFormat = "[\\dA-Za-z_]{5,}";
    static String confirmPasswordFormat = "[\\dA-Za-z_]{5,}";

    public void signUp(String login,String password, String confirmPassword ) throws WrongLoginException,WrongPasswordException,WrongPasswordEqualsException {
        if (login.matches(loginFormat)) {
            if(password.matches(passwordFormat) && confirmPassword.matches(confirmPasswordFormat) ){
                if(password.equals(confirmPassword)){
                    this.login = login;
                    this.password = password;
                    System.out.println("Вітаю реєстрація пройдено успішно");
                }else{
                    throw new WrongPasswordEqualsException("!!! Пароль не співпадає");
                }
            }
            else{
                throw new WrongPasswordException("!!! Парроль не відповідає вимогам");
            }
        } else {
            throw new WrongLoginException("!!! Логін не відповідає вимогам");
        }
    }
    public void signIn(String login,String password ) throws WrongLoginException,WrongPasswordEqualsException {
        if (this.login.equals(login) && this.password.equals(password)) {
                System.out.println("Вітаю Ви ви все виконали");
        } else {
            throw new WrongLoginException("!!! Логін або пароль не співпадають");
        }
    }
}