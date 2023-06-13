package listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import entity.Student;
import util.JdbcUtil;

public class ExcelListener extends AnalysisEventListener<Student> {
    @Override
    public void invoke(Student student, AnalysisContext analysisContext) {
        String sql = "insert into student value(?, ?, ?, ?, ?)";
        JdbcUtil.exeUpdate(sql, student.getId(), student.getUsername(), student.getPassword(), student.getName(), student.getGrade());
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
