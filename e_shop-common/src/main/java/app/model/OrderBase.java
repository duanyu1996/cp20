package app.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("t_order_base")
public class OrderBase {
    private Integer id;
    private Integer userId;
    private BigDecimal amount;
    private Integer status;
    private LocalDateTime orderDate;
}
