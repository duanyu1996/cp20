package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("t_focus")
public class Focus {
    private Integer id;
    private Integer goodsId;
    private Integer userId;
    private LocalDateTime focusTime;
}
