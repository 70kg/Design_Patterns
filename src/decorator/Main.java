package decorator;

/**
 * Created by Mr_Wrong on 15/12/27.
 */
public class Main {
    public static void main(String[] args) {
        ProgramMonkey programMonkey = new AndroidProgramMonkey();
        programMonkey.skills();

        programMonkey = new PatternDecorator(programMonkey);
        programMonkey.skills();

    }
}
