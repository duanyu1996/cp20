package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_order_detail")
public class OrderDetail {
    private Integer id;
    private Integer orderBaseId;
    private Integer goodsId;
    private Integer shoppingNum;
}
