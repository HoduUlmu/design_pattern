public class Practice {

    private Practice() {}

    private static class PracticeHolder {
        private static final Practice INSTANCE = new Practice();
    }

    public static Practice getInstance() {
        return PracticeHolder.INSTANCE;
    }

}
