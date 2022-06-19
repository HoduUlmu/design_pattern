// 직렬화, 리플렉션까지 대응하는 싱글톤 - enum
// enum 은 기본적으로 serializable 상속받고 동일 인스턴스 반환을 보장함
// 미리 만들어지는 단점있음 (클래스 로딩 시점)
public enum SettingsV2_5 {
    INSTANCE;
}
