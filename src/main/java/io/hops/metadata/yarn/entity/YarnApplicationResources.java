package io.hops.metadata.yarn.entity;

public class YarnApplicationResources {


    private final int inode_id;
    private final String name;
    private final int allocated_mb;
    private final int allocated_vcores;

    public YarnApplicationResources(int inode_id, String name, int allocated_mb, int allocated_vcores){
        this.inode_id = inode_id;
        this.name = name;
        this.allocated_mb = allocated_mb;
        this.allocated_vcores = allocated_vcores;
    }

    public int getInode_id() {
        return inode_id;
    }

    public String getName() {
        return name;
    }

    public int getAllocated_mb() {
        return allocated_mb;
    }

    public int getAllocated_vcores() {
        return allocated_vcores;
    }
}
