public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        return cmd.split("\\?")[0]; // 리팩토링
    }

    public String getParam(String key) {
        String param = cmd.split("\\?")[1];
        String paramKey = param.split("=")[0];

        if (paramKey.equals("keyword")) {
            return "자바";
        }
        if (paramKey.equals("keywordType")) {
            return "title";
        }

        return "";
    }
}
