package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_goods_type")
public class GoodsType {
    private Integer id;
    private String typeName;
}
