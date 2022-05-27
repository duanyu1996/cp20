package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_cart")
public class Cart {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer shoppingNum;
}
