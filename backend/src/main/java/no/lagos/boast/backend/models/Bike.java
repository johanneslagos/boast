package no.lagos.boast.backend.models;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

import java.util.Date;

@Entity
public class Bike {

    @Load private Ref<User> owner;
    @Id private Long id;
    private String name;
    private String brand;
    private String model;
    private String productionYear;
    private String frameId;
    private Date acquisitionDate;
    private int    likes;
    private String nickname;
    private BIKE_TYPE bikeType;


    public Ref<User> getOwner() {
        return owner;
    }

    public void setOwner(Ref<User> owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public BIKE_TYPE getBikeType() {
        return bikeType;
    }

    public void setBikeType(BIKE_TYPE bikeType) {
        this.bikeType = bikeType;
    }
}
