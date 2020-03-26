import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Long, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("张三的医嘱1");
        list.add("张三的医嘱2");
        list.add("张三的医嘱3");
        list.add("张三的医嘱4");
        List<String> list2 = new ArrayList<>();
        list2.add("里斯的医嘱1");
        list2.add("里斯的医嘱2");
        list2.add("里斯的医嘱3");
        list2.add("里斯的医嘱4");
        map.put(1L,list);
        map.put(2L,list2);
        List<String> list3 = map.get(2L);
        System.out.println(list3.toString());
        System.out.println("开发环境下1");
        System.out.println("开发环境新功能");
    }
}
