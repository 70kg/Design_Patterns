package decorator;

/**
 * Created by Mr_Wrong on 15/12/27.
 */
public class PatternDecorator extends ProgramMonkeyDecorator {
    public PatternDecorator(ProgramMonkey programMonkey) {
        super(programMonkey);
    }

    @Override
    public void skills() {
        super.skills();
        System.out.println("会设计模式");
    }
}
