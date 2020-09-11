package com.encapsulateideas.anter.Anter.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class IpCamera {
    @Id
    private String id;
    private String camName;
    private String camIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCamName() {
        return camName;
    }

    public void setCamName(String camName) {
        this.camName = camName;
    }

    public String getCamIp() {
        return camIp;
    }

    public void setCamIp(String camIp) {
        this.camIp = camIp;
    }


}
