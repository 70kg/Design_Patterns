package state;

/**
 * Created by Mr_Wrong on 16/3/31.
 */
public class LoginActivity {
    public static void login() {
        LoginContext.getInstance().setStatus(new LoginState());
        System.out.println("登录成功");
    }
}
