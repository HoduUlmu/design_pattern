// 스레드 세이프한 방법 - 이른 초기화 (eager init)
// 객체를 만드는 비용이 비싸지 않아서 나중에 만들지 않아도 될경우
// 객체의 비용이 비쌀 경우 미리 만들기 때문에 좋지 않을 수 있음(자주 사용하지 않거나...)
public class SettingsV2_2 {

    // 클래스 로딩되는 시점에 생성
    private static final SettingsV2_2 INSTANCE = new SettingsV2_2();

    private SettingsV2_2() {}

    public static SettingsV2_2 getInstance() {
        return INSTANCE;
    }
}
