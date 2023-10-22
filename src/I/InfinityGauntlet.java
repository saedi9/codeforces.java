package I;

import java.util.*;

public class InfinityGauntlet {
    public static void main(String[] at){
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("purple","Power");
        map.put("green","Time");
        map.put("blue","Space");
        map.put("orange","Soul");
        map.put("red","Reality");
        map.put("yellow","Mind");
        List<String> list=new LinkedList<>();
        list.addAll(Arrays.asList("purple","green","blue","orange","red","yellow"));
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list.remove(sc.nextLine());
        }
        System.out.println(list.size());
        for (String c:list) {
            System.out.println(map.get(c));
        }
    }
}
