// 스레드 세이프한 방법 - synchronized
// getInstance 메소드 호출할 때마다 동기화처리해야 해서 성능 불이익 있음
// 락을 사용해 락을 가지고 있는 스레드만 접근 가능하게 하는 메커니즘이라 그럼
public class SettingsV2_1 {

    private static SettingsV2_1 instance;

    private SettingsV2_1() {}

    // synchronized - 하나에 한번의 스레드만 접근 가능하게 만듬
    public static synchronized SettingsV2_1 getInstance() {
        if (instance == null)
            instance = new SettingsV2_1();
        return instance;
    }
}
