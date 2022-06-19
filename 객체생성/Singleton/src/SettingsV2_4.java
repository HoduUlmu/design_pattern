// 스레드 세이프한 방법 - static inner class
// 권장
// getInstance가 호출이 될 때 static class가 로딩이 되고 그 때 인스턴스 생성되기에 lazy loading
public class SettingsV2_4 {
    private SettingsV2_4() {}

    private static class SettingsHolder {
        private static final SettingsV2_4 INSTANCE = new SettingsV2_4();
    }

    public static SettingsV2_4 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
