package model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by lindeting on 16/7/18.
 */
public class CarInfo implements Serializable{

    private static final long serialVersionUID = 2003095974339347114L;
    @Id
    @Field("id")
    private String id;
    @Field("businessId")
    private Integer businessId;
    @Field("name")
    private String name;
    @Field("type")
    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id='" + id + '\'' +
                ", businessId=" + businessId +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
