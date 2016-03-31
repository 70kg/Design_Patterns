package decorator;

/**
 * Created by Mr_Wrong on 15/12/27.
 */
public class PhpProgramMonkey implements ProgramMonkey {
    @Override
    public void skills() {
        System.out.println("会写PHP");
    }
}
