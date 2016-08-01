import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import model.CarInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.SolrService;

/**
 * ldt 2016.7.21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CarInfoTest {

    @Resource
    private SolrService solrService;

    @Test
    public void findbyName(){
//        String name = "悍马";
        String name = "汽车";
        Integer pageNo = 0;
        Integer pageSize = 10;
        Page<CarInfo> list = solrService.findByName(name,pageNo,pageSize);
        System.out.println(list.getContent().size());
        solrService.delete(list.getContent());
    }

    @Test
    public void save(){
        CarInfo carInfo = new CarInfo();
        carInfo.setName("豪车");
        carInfo.setBusinessId(1111);
        carInfo.setType(3);
        carInfo.setId(UUID.randomUUID().toString());
        solrService.save(carInfo);
    }

    @Test
    public void update(){
        CarInfo carInfo = solrService.findByBusinessIdAndType(1111,3);
        System.out.println(carInfo.getId());
        carInfo.setName("君子建");
        solrService.save(carInfo);
    }






}
