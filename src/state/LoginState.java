package state;

/**
 * Created by Mr_Wrong on 16/3/31.
 */
public class LoginState implements UserState {
    @Override
    public void fordward() {
        System.out.println("转发");
    }

    @Override
    public void commit() {
        System.out.println("评论");
    }
}
