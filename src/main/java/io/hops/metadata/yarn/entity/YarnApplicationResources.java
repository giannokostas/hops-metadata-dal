package io.hops.metadata.yarn.entity;

public class YarnApplicationResources {


    private final String appId;
    private final int allocated_mb;
    private final int allocated_vcores;

    public YarnApplicationResources(String appId, int allocated_mb, int allocated_vcores){
        this.appId = appId;
        this.allocated_mb = allocated_mb;
        this.allocated_vcores = allocated_vcores;
    }

    public String getAppId() {
        return appId;
    }

    public int getAllocated_mb() {
        return allocated_mb;
    }

    public int getAllocated_vcores() {
        return allocated_vcores;
    }
}
