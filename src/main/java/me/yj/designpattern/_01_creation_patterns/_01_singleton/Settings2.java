package me.yj.designpattern._01_creation_patterns._01_singleton.1_creation_patterns.1-1_singleton;

/**
 * synchronized 사용해서 동기화 처리
 */
public class Settings2 {

    private static Settings2 instance;

    private Settings2() { }

    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }

        return instance;
    }

}
