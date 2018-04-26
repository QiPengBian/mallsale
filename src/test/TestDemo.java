import com.atguigu.bean.ColorVersionVO;
import com.atguigu.bean.MallSkuVO;
import com.atguigu.bean.TMallProduct;
import com.atguigu.bean.TMallpojo;
import com.atguigu.mapper.ListMapper;
import com.atguigu.mapper.TMallProductMapper;
import com.atguigu.service.ListService;
import com.atguigu.utils.FastJsonUtils;
import com.atguigu.utils.JedisPoolUtils;
import com.atguigu.utils.MyJsonUtil;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luwan on 2018/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {
    private static final Logger logger = Logger.getLogger(TestDemo.class);


    @Autowired
    private ListService listService;


    @Test
    public void DemoList(){
        String ss="[{\"id\":1,\"shpId\":8,\"kc\":0,\"jg\":10000.0,\"chjshj\":1491986138000,\"skuMch\":\"小明联想低端配置系列显示器14寸100瓦功率\",\"skuXl\":22,\"kcdz\":\"昌平区北七家大仓库\",\"shptp\":\"1491986138116u=2528461445,241269007&fm=23&gp=0.jpg\"},{\"id\":2,\"shpId\":7,\"kc\":93,\"jg\":43330.0,\"chjshj\":1491986072000,\"skuMch\":\"小明联想中端系列显示器200瓦15寸\",\"skuXl\":6,\"kcdz\":\"昌平区北七家大仓库\",\"shptp\":\"1491986072915u=3073007440,1268514512&fm=23&gp=0.jpg\"}]";
        List<TMallpojo> tMallpojos = MyJsonUtil.json_to_list_nodecod(ss, TMallpojo.class);

        logger.info(tMallpojos);

/*

        List<MallSkuVO> listsku = listService.getListbyflbh2(28);
        String ss = FastJsonUtils.toJSONString(listsku.get(0));
        logger.info(listsku.get(0));
        String s = MyJsonUtil.object_to_json(listsku.get(0));
        logger.info(s);
        logger.info(ss);
*/




    }

    /*@Test
    public void Votest(){
        TMallProductMapper tMallProduct = (TMallProductMapper) ios.getBean("TMallProductMapper");

     *//*   Map mp=new HashMap<>();
        mp.put("shpid",6);
        ColorVersionVO colorVersionVO = tMallProduct.selectColorAndVersionBySpu(mp);*//*

        logger.info("-----------------------"+tMallProduct+"-----------------------");


    }*/
}
