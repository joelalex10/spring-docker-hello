package com.example.demo.models;

public class Response {
    public String greating;
    public String hostIp;
    public String hostName;
    public Response(){

    }

    public Response(String greating, String hostIp, String hostName) {
        this.greating = greating;
        this.hostIp = hostIp;
        this.hostName = hostName;
    }

    public String getGreating() {
        return greating;
    }

    public void setGreating(String greating) {
        this.greating = greating;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
