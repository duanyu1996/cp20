package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("t_notice")
public class Notice {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime time;
}
