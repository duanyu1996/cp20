package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_admin")
public class Admin {
    /**
     * PK
     */
    private String name;
    private String pwd;
}
