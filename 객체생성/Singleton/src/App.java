public class App {
    public static void main(String[] args) throws Exception {
        SettingsV1 settings1 = SettingsV1.getInstance();
        SettingsV1 settings2 = SettingsV1.getInstance();
        System.out.println(settings1 == settings2);

        SettingsV2_1 settings3 = SettingsV2_1.getInstance();
        SettingsV2_1 settings4 = SettingsV2_1.getInstance();
        System.out.println(settings3 == settings4);

        SettingsV2_2 settings5 = SettingsV2_2.getInstance();
        SettingsV2_2 settings6 = SettingsV2_2.getInstance();
        System.out.println(settings5 == settings6);

        SettingsV2_3 settings7 = SettingsV2_3.getInstance();
        SettingsV2_3 settings8 = SettingsV2_3.getInstance();
        System.out.println(settings7 == settings8);

        SettingsV2_4 settings9 = SettingsV2_4.getInstance();
        SettingsV2_4 settings10 = SettingsV2_4.getInstance();
        System.out.println(settings9 == settings10);

        BreakSettingsV2.breakSettings();

        SettingsV2_5 settings11 = SettingsV2_5.INSTANCE;
        SettingsV2_5 settings12 = SettingsV2_5.INSTANCE;
        System.out.println(settings11 == settings12);

        //ex
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime == runtime2);
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());

    }
}
