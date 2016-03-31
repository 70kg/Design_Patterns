package state;

/**
 * Created by Mr_Wrong on 16/3/31.
 * 状态模式
 */
public class MainActivity {
    //转发
    private static void forward() {
        LoginContext.getInstance().forward();
    }

    //注销
    private static void logout() {
        LoginContext.getInstance().setStatus(new LogoutState());
    }

    public static void main(String[] args) {
        forward();
        forward();
        logout();
        forward();
    }
}
