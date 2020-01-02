package com.example.myapplication.effective;

public class Item43 {

    public static void main() {
        //java 8 map안에 추가된 merge
        //before
//        map.merge(key, 1, (count, incr) -> count + incr);
        //after
//        map.merge(key, 1, Integer::sum);
    }

    class GoshThisClassnameIsHumongous{
        //before
//        service.execute(GoshThisClassnameIsHumongous::action);

        //after
//        service.execute(() -> action());
    }

}
