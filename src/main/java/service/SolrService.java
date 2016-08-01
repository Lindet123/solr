package service;

import repository.CarInfoRepository;
import model.CarInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lindeting on 16/7/21.
 */
@Service
public class SolrService {
    @Resource
    private CarInfoRepository carInfoRepository;

    public void save(CarInfo carInfo){
        carInfoRepository.save(carInfo);
    }

    public Page<CarInfo> findByName(String name, Integer pageNo, Integer pageSize){
        Pageable pageable = new PageRequest(pageNo,pageSize);
        return carInfoRepository.findByName(name,pageable);
    }

    public CarInfo findByBusinessIdAndType(Integer businessId,Integer type){
        return carInfoRepository.findByBusinessIdAndType(businessId,type);
    }

    public List<CarInfo> findAll(){
       return (List<CarInfo>) carInfoRepository.findAll();
    }

    public void delete(List<CarInfo> carInfoList){
        carInfoRepository.delete(carInfoList);
    }


}
