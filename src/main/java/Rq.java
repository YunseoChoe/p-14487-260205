public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        return cmd.split("\\?")[0]; // 리팩토링
    }

    public String getParam(String key) {
        // 하드코딩 (Green)
        if(cmd.equals("목록?keyword=자바")) {
            return "자바";
        }

        if(cmd.equals("목록?keywordType=title")) {
            return "title";
        }

        return "";
    }
}
