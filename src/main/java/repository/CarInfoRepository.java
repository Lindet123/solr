package repository;

import model.CarInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * Created by lindeting on 16/7/21.
 */
public interface CarInfoRepository extends SolrCrudRepository<CarInfo, String> {
    Page<CarInfo> findByName(String name, Pageable pageable);

    CarInfo findByBusinessIdAndType(Integer businessId,Integer type);
}
