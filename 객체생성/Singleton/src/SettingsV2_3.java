// 스레드 세이프한 방법 - double checked locking
// 싱크로나이즈드 비용을 줄이고 인스턴스를 필요로 하는 시점에 만들기에 코드 복잡성에도 불구하고 효율적
public class SettingsV2_3 {

    // 자바 1.5 이상부턴 volatile 적어줘야 기능함 - 복잡한 방법임
    private static volatile SettingsV2_3 instance;

    private SettingsV2_3() {}

    public static SettingsV2_3 getInstance() {
        if (instance == null) {
            synchronized (SettingsV2_3.class) {
                if (instance == null)
                    instance = new SettingsV2_3();
            }
        }
        return instance;
    }
}
