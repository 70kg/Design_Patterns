package decorator;

/**
 * Created by Mr_Wrong on 15/12/27.
 */
public class ProgramMonkeyDecorator implements ProgramMonkey {
    public ProgramMonkeyDecorator(ProgramMonkey programMonkey) {
        mProgramMonkey = programMonkey;
    }

    protected ProgramMonkey mProgramMonkey;

    @Override
    public void skills() {
        mProgramMonkey.skills();
    }
}
