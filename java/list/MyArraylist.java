package list;

import java.util.ArrayList;

/**
 * @Description TODO
 * @author li zhe
 * @createTime 2019-08-11 10:39
 */
public class MyArraylist {
    private int size;
    private Object[] elementData;

    public MyArraylist(int initCapacity) {
        if (initCapacity>0){
            elementData = new Object[initCapacity];
        } else if (initCapacity == 0) {
            elementData = new Object[0];
        } else {
            throw new RuntimeException("初始化参数不合理");
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
//        System.out.println(list.add(1));
        for (int i = 0; i < 11; i++) {
            list.add(1);

        }

    }
}
