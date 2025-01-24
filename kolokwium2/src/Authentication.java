interface Authentication {
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldPassword, String newPassword);
}

abstract class UserAuthentication implements Authentication{
    private String userpassword = "123456";

    @Override
    public boolean login(String username, String password){
        return userpassword.equals(password);
    }
    @Override
    public void logout(){
        System.out.println("Wylogowano");
    }
}
abstract class AdminAuthentication implements Authentication{
    private String userpassword = "123456";

    @Override
    public boolean login(String username, String password){
        return userpassword.equals(password);
    }
    @Override
    public void logout(){
        System.out.println("Wylogowano");
    }
}