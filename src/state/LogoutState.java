package state;

/**
 * Created by Mr_Wrong on 16/3/31.
 */
public class LogoutState implements UserState {
    @Override
    public void fordward() {
        System.out.println("需要登录才能转发");
        LoginActivity.login();
    }

    @Override
    public void commit() {
        System.out.println("需要登录才能评论");
        LoginActivity.login();
    }
}
