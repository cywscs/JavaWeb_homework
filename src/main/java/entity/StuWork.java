package entity;


/***
 * 学生已提交的作业类
 * @author cywscs
 */
public class StuWork {

    public Integer id;

    public String WorkId;

    public String StuId;

    public String answer;

    public String attachment;

    public String status;

    public String score;

    public String comment;

    public String argument;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkId() {
        return WorkId;
    }

    public void setWorkId(String workId) {
        WorkId = workId;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String stuId) {
        StuId = stuId;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
}
