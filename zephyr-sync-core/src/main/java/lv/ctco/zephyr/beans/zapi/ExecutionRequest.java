package lv.ctco.zephyr.beans.zapi;

public class ExecutionRequest {

    private int status;
    private String comment;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}