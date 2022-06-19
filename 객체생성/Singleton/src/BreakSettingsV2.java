import java.lang.reflect.Constructor;

public class BreakSettingsV2 {
    public static void breakSettings() throws Exception {
        SettingsV2_4 settings = SettingsV2_4.getInstance();

        // 리플렉션
        Constructor<SettingsV2_4> constructor = SettingsV2_4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV2_4 settings1 = constructor.newInstance();

        System.out.println(settings != settings1);

        // 직렬화, 역직렬화 사용하기 - 해당 클래스에 serializable 있을 때
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settingsV4.obj"))) {
//            out.writeObject(settings);
//        }
//
//        SettingsV2_4 settings2;
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settingsV4.obj"))) {
//            settings2 = (SettingsV2_4) in.readObject();
//        }
//
//        System.out.println(settings != settings2);

        // 역직렬화할 때 사용되는 메소드인
        // protected void readResolve()를 인스턴스 반환으로 정의하면 대응가능


    }
}
