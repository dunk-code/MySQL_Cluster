import cn.itcast.pojo.Brand;
import cn.itcast.pojo.User;
import cn.itcast.service.BrandService;
import cn.itcast.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：zsy
 * @date ：Created 2021/5/3 11:18
 * @description：
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-datasource.xml","classpath:applicationContext-common.xml"})
public class Test {

    @Autowired
    BrandService brandService;

    @Autowired
    UserService userService;

    @org.junit.Test
    public void TestInsertBrand() {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-common.xml","applicationContext-datasource.xml");
        //BrandService brandService = (BrandService) applicationContext.getBean("brandService",BrandService.class);
        //brandService.insert(new Brand(null,"华为","H"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        System.out.println(new Timestamp(new Date().getTime()));
        userService.insert(new User(null,"赵四","123456","zs", new Timestamp(new Date().getTime()),"男","834187150@qq.com"
        ,"17782953628","834187150"));
    }
}
