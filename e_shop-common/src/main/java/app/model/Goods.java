package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_goods")
public class Goods {
    private Integer id;
    private String name;
    /**
     * 原价
     */
    private BigDecimal oPrice;
    /**
     * 现价
     */
    private BigDecimal rPrice;
    private Integer store;
    private String picture;
    private Integer goodsTypeId;
}
