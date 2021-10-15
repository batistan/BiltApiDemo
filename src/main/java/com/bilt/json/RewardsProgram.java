package com.bilt.json;

public class RewardsProgram {
    public String id;
    public String name;
    public long transferRate;

    public RewardsProgram() {}

    public RewardsProgram(String id, String name, long transferRate) {
        this.id = id;
        this.name = name;
        this.transferRate = transferRate;
    }
}
