package appointmentApp.model;

public class User {

    private Integer userId;
    private String userName;
    private String passWord;

    private User(Integer userId, String userName, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }

    private Integer getUserId() {
        return userId;
    }

    private void setUserId(Integer userId) {
        this.userId = userId;
    }

    private String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private String getPassWord() {
        return passWord;
    }

    private void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
