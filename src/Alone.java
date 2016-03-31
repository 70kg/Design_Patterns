import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Created by Mr_Wrong on 15/12/28.
 */
public class Alone {
    public static void main(String[] args) {
        Jdk8 jdk8 = new Jdk8();
        jdk8.testJdk8();
    }


    static class Jdk8 {


        public void testJdk8() {
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                list.add(i + "");
            }
            long start = System.nanoTime();//获取系统开始排序的时间点
            int count = (int) ((Stream) list.stream().parallel()).sorted().count();
            long end = System.nanoTime();//获取系统结束排序的时间点
            long ms = TimeUnit.NANOSECONDS.toMillis(end - start);//得到并行排序所用的时间
            System.out.println(ms);

            list.stream().parallel()
                    .map((s) -> Integer.parseInt(s))
                    .map((index) -> {
                        String s = index.toString();
                        return s;
                    })
//                    .flatMap((s) -> {
//                        
//                        list.add("nism");
//                        return list.stream();
//                    })
                    .forEach((s) -> {
                        System.out.println(s);
                    });
        }

    }


}
