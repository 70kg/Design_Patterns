package state;

/**
 * Created by Mr_Wrong on 16/3/31.
 */
public class LoginContext {
    static LoginContext mLoginContext;
    UserState mUserState = new LogoutState();

    public static LoginContext getInstance() {
        if (mLoginContext == null) {
            synchronized (LoginContext.class) {
                if (mLoginContext == null) {
                    mLoginContext = new LoginContext();
                }
            }
        }
        return mLoginContext;
    }

    public void setStatus(UserState userState) {
        mUserState = userState;
    }

    public void forward() {
        mUserState.fordward();
    }

    public void commit() {
        mUserState.commit();
    }
}
