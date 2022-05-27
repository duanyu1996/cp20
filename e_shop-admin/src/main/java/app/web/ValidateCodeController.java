package app.web;

import app.util.RandomCodeUtil;
import app.vo.ValidateCode;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@RequestMapping("/validateCode")
public class ValidateCodeController {

    public static final Logger logger = Logger.getLogger("ValidateCodeController");

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    ValidateCode validateCode() {
        // 生产4位随机str
        String str = RandomCodeUtil.getRandomString(4);
        logger.info(str);
        // 调用外部api接受图片的字节数据
        String url = "http://api.diaoyan.buzz/API/yzm/api.php?code={str}";
        byte[] bytes = restTemplate.getForObject(url, byte[].class, str);
        // 将字节数据转为base64
        String base64 = Base64.encodeBase64String(bytes);
        // 新建ValidateCode对象，封装2个属性
        ValidateCode code = new ValidateCode();
        code.setCodeText(str);
        code.setCodeImg(base64);
        return code;
    }
}
