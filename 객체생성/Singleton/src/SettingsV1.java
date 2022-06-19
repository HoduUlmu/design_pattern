// 가장 간단한 방법
// 멀티 스레드에서 위험!
public class SettingsV1 {

    private static SettingsV1 instance;

    // private 생성자로 외부의 인스턴스 생성을 막음
    private SettingsV1() {}

    // static - global access
    public static SettingsV1 getInstance() {
        if (instance == null)
            instance = new SettingsV1();
        return instance;
    }
}
